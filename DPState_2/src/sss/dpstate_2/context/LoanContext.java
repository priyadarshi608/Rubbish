/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.context;

import sss.dpstate_2.loandetails.LoanDetails;
import sss.dpstate_2.state.ICanApprove;
import sss.dpstate_2.state.ICanGetApprovedInterestRate;
import sss.dpstate_2.state.ICanGetLikelyInterestRate;
import sss.dpstate_2.state.ICanSubmitForApproval;
import sss.dpstate_2.state.ICanSubmitForApproval;
import sss.dpstate_2.state.InProcessState;
import sss.dpstate_2.state.LoanApplicationState;

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

	public void SubmitForApproval() {
		ICanSubmitForApproval iCanSubmitForApproval = null;
		if (state instanceof ICanSubmitForApproval) {
			iCanSubmitForApproval = (ICanSubmitForApproval) state;
			iCanSubmitForApproval.SubmitForApproval(this);
		} else {
			System.out.println("Can't be submitted for approval now..");
		}
	}

	public String GetApprovedInterestRate() {
		ICanGetApprovedInterestRate iCanGetApprovedInterestRate = null;
		if (state instanceof ICanGetApprovedInterestRate) {
			iCanGetApprovedInterestRate = (ICanGetApprovedInterestRate) state;
			return iCanGetApprovedInterestRate.getApprovedInterestRate();
		} else {
			String message = "Approved interest rate can't be get..";
			System.out.println(message);
			return message;
		}
	}

	public String CalculateLikelyInterestRate() {
		ICanGetLikelyInterestRate iCanGetLikelyInterestRate = null;
		if (state instanceof ICanGetLikelyInterestRate) {
			iCanGetLikelyInterestRate = (ICanGetLikelyInterestRate) state;
			return iCanGetLikelyInterestRate.getLikelyInterestRate();
		} else {
			String message = "Likely interest rate can't be get..";
			System.out.println(message);
			return message;
		}
	}

	public void ChangeDetails(LoanDetails loanDetails) {
		state.ChangeDetails(loanDetails);
	}

//	public void approve() {
//		state.approve(this);
//		ICanApprove iCanApprove = null;
//	}
//
//	public void deny() {
//		state.deny(this);
//	}

}
