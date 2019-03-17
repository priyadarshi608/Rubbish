/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

import sss.dpstate_2.context.LoanContext;
import sss.dpstate_2.loandetails.LoanDetails;

public class DPState_2_Demo {
	public static void main(String[] args) {
		LoanContext loanContext = new LoanContext();
		loanContext.ChangeDetails(new LoanDetails());
		loanContext.SubmitForApproval();
//		loanContext.Approve();
		loanContext.GetApprovedInterestRate();
	}
}
