/**
 * A BAD example of state pattern
 */

import sss.dpstate_1.context.LoanContext;
import sss.dpstate_1.loandetails.LoanDetails;

public class DPState_1_Demo {
	public static void main(String[] args) {
		LoanContext loanContext = new LoanContext();
		loanContext.ChangeDetails(new LoanDetails());
//		loanContext.GetApprovedInterestRate();
		loanContext.SubmitForApproval();
		loanContext.approve();
		loanContext.GetApprovedInterestRate();
	}
}
