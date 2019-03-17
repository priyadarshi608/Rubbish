import java.util.Date;

public class BookReservation {
  public Date creationDate;
  public ReservationStatus status;
  public String bookItemBarcode;
  public String memberId;

  public static BookReservation fetchReservationDetails(String barcode) {
	  return null;
  }
  
  public void sendBookAvailableNotification() {}
  
}