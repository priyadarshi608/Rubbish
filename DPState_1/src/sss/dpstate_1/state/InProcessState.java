/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.state;

import sss.dpstate_1.context.LoanContext;
import sss.dpstate_1.exception.InvalidOperationException;
import sss.dpstate_1.loandetails.LoanDetails;

public class InProcessState implements LoanApplicationState {
	LoanDetails loanDetails;

	public InProcessState() {
		this.loanDetails = new LoanDetails();
	}

	@Override
	public void approve(LoanContext loanContext) {
		throw new InvalidOperationException("Cannot approve an inprocess application");
	}

	@Override
	public void deny(LoanContext loanContext) {
		throw new InvalidOperationException("Cannot deny an inprocess application");
	}

	@Override
	public String GetApprovedInterestRate() {
		throw new InvalidOperationException("No approved interest rate exists on an in process application");
	}

	@Override
	public String CalculateLikelyInterestRate() {
		return "(5 to 10) %";
	}

	@Override
	public void ChangeDetails(LoanDetails details) {
		this.loanDetails = details;
	}

	@Override
	public void SubmitForApproval(LoanContext loanContext) {
		loanContext.setState(new AwaitingApprovalState());
	}
	
}
