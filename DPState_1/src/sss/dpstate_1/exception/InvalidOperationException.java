/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.exception;

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
