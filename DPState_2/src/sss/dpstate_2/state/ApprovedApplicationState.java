/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.state;

import sss.dpstate_2.context.LoanContext;
import sss.dpstate_2.exception.InvalidOperationException;
import sss.dpstate_2.loandetails.LoanDetails;

public class ApprovedApplicationState 
implements LoanApplicationState {
	LoanDetails loanDetails;

	public ApprovedApplicationState() {
		this.loanDetails = new LoanDetails();
	}

	@Override
	public void ChangeDetails(LoanDetails details) {
		this.loanDetails = details;
	}

}
