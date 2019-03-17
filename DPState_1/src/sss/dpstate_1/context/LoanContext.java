/**
 * A BAD example of state pattern
 */

package sss.dpstate_1.context;

import sss.dpstate_1.loandetails.LoanDetails;
import sss.dpstate_1.state.InProcessState;
import sss.dpstate_1.state.LoanApplicationState;

public class LoanContext {

	private LoanApplicationState state;

	public LoanContext() {
		this.state = new InProcessState();
	}
	
	public void setState(LoanApplicationState state) {
		this.state = state;
	}

	public LoanApplicationState getState() {
		return state;
	}

	public void approve() {
		state.approve(this);
	}
	
	public void deny() {
		state.deny(this);
	}
	
	public void SubmitForApproval() {
		state.SubmitForApproval(this);
	}
	
	public String GetApprovedInterestRate() {
		return state.CalculateLikelyInterestRate();
	}
	
	public String CalculateLikelyInterestRate() {
		return state.CalculateLikelyInterestRate();
	}
	
	public void ChangeDetails(LoanDetails loanDetails) {
		state.ChangeDetails(loanDetails);
	}
	
}
