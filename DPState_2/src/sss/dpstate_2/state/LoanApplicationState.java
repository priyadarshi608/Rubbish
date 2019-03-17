/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.state;

import sss.dpstate_2.context.LoanContext;
import sss.dpstate_2.loandetails.LoanDetails;

public interface LoanApplicationState {
//	public void approve(LoanContext loanContext);
//	public void deny(LoanContext loanContext);
//	String GetApprovedInterestRate();
//	String CalculateLikelyInterestRate();
//	void SubmitForApproval(LoanContext loanContext);
	void ChangeDetails(LoanDetails details); 
}
