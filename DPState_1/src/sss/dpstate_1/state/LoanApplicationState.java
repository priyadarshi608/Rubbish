/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.state;

import sss.dpstate_1.context.LoanContext;
import sss.dpstate_1.loandetails.LoanDetails;

public interface LoanApplicationState {
	public void approve(LoanContext loanContext);
	public void deny(LoanContext loanContext);
	String GetApprovedInterestRate();
	String CalculateLikelyInterestRate();
	void SubmitForApproval(LoanContext loanContext);
	void ChangeDetails(LoanDetails details); 
}
