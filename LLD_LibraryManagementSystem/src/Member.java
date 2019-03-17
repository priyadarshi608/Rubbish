import java.time.LocalDate;
import java.util.Date;

public class Member extends Account {
	private String memberId;
	private Date dateOfMembership;
	private int totalBooksCheckedout;
	public int getTotalBooksCheckedout() {
		return 0;
	}
	public boolean reserveBookItem(BookItem bookItem) {
		return false;
	}
	
	public boolean checkoutBookItem(BookItem bookItem) {
		if(this.totalBooksCheckedout >= Constants.MAX_BOOKS_ISSUED_TO_A_USER ) {
			ApplicationUtility.showError("The user has already checkedout maximum number of books");
			return false;
		}
		BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.barcode);
		if( bookReservation != null &&  bookReservation.memberId != this.memberId) {
			// book item has a pending reservation from another user
			ApplicationUtility.showError("This book is reserved by another member");
			return false;
		} else if( bookReservation != null ) {
			// book item has a pending reservation from the give member, update it
//			bookReservation.setStatus(ReservationStatus.COMPLETED);
			bookReservation.status = ReservationStatus.COMPLETED;
		}

		if(!bookItem.checkout(this.memberId)) {
			return false;
		}

		this.incrementTotalBooksCheckedout();
		return true;
	}

	private void checkForFine(String bookItemBarcode) {
		BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
		Date dueDate = bookLending.dueDate;
		Date today = new Date();
		// check if the book has been returned within the due date
		if(today.compareTo(dueDate) > 0) {
			long diff = today.getTime() - dueDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			Fine.collectFine(memberId, diffDays);
		}
	}

	public void returnBookItem(BookItem bookItem) {
		this.checkForFine(bookItem.barcode);
		BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.barcode);
		if(bookReservation != null) {
			// book item has a pendening reservation
//			bookItem.setStatus(BookStatus.RESERVED);
			bookItem.status = BookStatus.RESERVED;
			bookReservation.sendBookAvailableNotification();
		}
//		bookItem.setStatus(BookStatus.AVAILABLE);
		bookItem.status = BookStatus.AVAILABLE;
	}

	public boolean renewBookItem(BookItem bookItem) {
		this.checkForFine(bookItem.barcode);
		BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.barcode);
		if( bookReservation != null && bookReservation.memberId != this.memberId) {
			// book item has a pendening reservation from another member
			ApplicationUtility.showError("This book is reserved by another member");
			this.decrementTotalBooksCheckedout();
//			bookItem.setStatus(BookStatus.RESERVED);
			bookItem.status = BookStatus.RESERVED;
			bookReservation.sendBookAvailableNotification();
			return false;
		} else if( bookReservation != null ){
			// book item has a pendening reservation from this member
//			bookReservation.setStatus(ReservationStatus.COMPLETED);
			bookReservation.status = ReservationStatus.COMPLETED;
			return true;
		}
		BookLending.lendBook(bookItem.barcode, this.memberId);
		bookItem.updateDueDate(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS));
		return true;
	}

	private void incrementTotalBooksCheckedout() {}

	public void decrementTotalBooksCheckedout() {}

	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}

}
