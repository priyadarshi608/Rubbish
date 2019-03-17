/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.state;

import sss.dpstate_1.context.LoanContext;
import sss.dpstate_1.exception.InvalidOperationException;
import sss.dpstate_1.loandetails.LoanDetails;

public class AwaitingApprovalState implements LoanApplicationState {
	LoanDetails loanDetails;

	public AwaitingApprovalState() {
		this.loanDetails = new LoanDetails();
	}

	@Override
	public void approve(LoanContext loanContext) {
		loanContext.setState(new ApprovedApplicationState());
	}

	@Override
	public void deny(LoanContext loanContext) {
		loanContext.setState(new DeniedApplicationState());
	}

	@Override
	public String GetApprovedInterestRate() {
		return "7 %";
	}

	@Override
	public String CalculateLikelyInterestRate() {
		return "7 %";
	}

	@Override
	public void ChangeDetails(LoanDetails details) {
		this.loanDetails = details;
	}

	@Override
	public void SubmitForApproval(LoanContext loanContext) {
		throw new InvalidOperationException("Already submitted.");
	}
	
}
