import java.time.LocalDate;
import java.util.Date;

public class BookItem extends Book {
	public String barcode;
	public boolean isReferenceOnly;
	public Date borrowed;
	public Date dueDate;
	public double price;
	public BookFormat format;
	public BookStatus status;
	public Date dateOfPurchase;
	public Date publicationDate;
	public Rack placedAt;

	public boolean checkout(String memberId) {
		if(this.isReferenceOnly) {
			ApplicationUtility.showError("This book is Reference only and can't be issued");
			return false;
		}
		if(!BookLending.lendBook(this.barcode, memberId)){
			return false;
		}
		this.updateBookItemStatus(BookStatus.LOANED);
		return true;
	}
	
	private void updateBookItemStatus(BookStatus bookStatus) {
		this.status = bookStatus;
	}
	
	public void updateDueDate(LocalDate localDate) {}
	
}