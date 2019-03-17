import java.util.Date;

public class BookLending {
	public Date creationDate;
	public Date dueDate;
	public Date returnDate;
	public String bookItemBarcode;
	public String memberId;

	public static boolean lendBook(String barcode, String memberId) {
		BookLending bookLending = new BookLending();
		bookLending.bookItemBarcode = barcode;
		bookLending.memberId = memberId;
		//... save it to database
		return true;
	}

	public static BookLending fetchLendingDetails(String barcode) {
		//... fetch it from database
		return null;
	}
	
}
