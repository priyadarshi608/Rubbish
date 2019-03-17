/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.state;

import sss.dpstate_1.context.LoanContext;
import sss.dpstate_1.exception.InvalidOperationException;
import sss.dpstate_1.loandetails.LoanDetails;

public class DeniedApplicationState implements LoanApplicationState {
	LoanDetails loanDetails;

	public DeniedApplicationState() {
		this.loanDetails = new LoanDetails();
	}

	@Override
	public void approve(LoanContext loanContext) {
		throw new InvalidOperationException("Already denied..");
	}

	@Override
	public void deny(LoanContext loanContext) {
		throw new InvalidOperationException("Already denied..");
	}

	@Override
	public String GetApprovedInterestRate() {
		throw new InvalidOperationException("Loan application denied..");
	}

	@Override
	public String CalculateLikelyInterestRate() {
		throw new InvalidOperationException("Loan application denied..");
	}

	@Override
	public void ChangeDetails(LoanDetails details) {
		this.loanDetails = details;
	}

	@Override
	public void SubmitForApproval(LoanContext loanContext) {
		throw new InvalidOperationException("Loan application denied..");
	}
	
}
