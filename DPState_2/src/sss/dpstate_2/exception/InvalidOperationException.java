/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.exception;

public class InvalidOperationException extends RuntimeException {
	/**
	 * Constructs the exception object.
	 */
	public InvalidOperationException() {
		super();
	}
	
	/**
	 * Constructs the exception object with the given message.
	 * @param message the message related to the exception.
	 */
	public InvalidOperationException(String message) {
		super(message);
	}
}
