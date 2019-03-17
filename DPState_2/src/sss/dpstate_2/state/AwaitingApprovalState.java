/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.state;

import sss.dpstate_2.context.LoanContext;
import sss.dpstate_2.exception.InvalidOperationException;
import sss.dpstate_2.loandetails.LoanDetails;

public class AwaitingApprovalState 
implements LoanApplicationState, ICanApprove, ICanDeny {
	LoanDetails loanDetails;

	public AwaitingApprovalState() {
		this.loanDetails = new LoanDetails();
	}

	@Override
	public void Approve(LoanContext loanContext) {
		loanContext.setState(new ApprovedApplicationState());
	}

	@Override
	public void Deny(LoanContext loanContext) {
		loanContext.setState(new DeniedApplicationState());
	}

	@Override
	public void ChangeDetails(LoanDetails details) {
		this.loanDetails = details;
	}

}
