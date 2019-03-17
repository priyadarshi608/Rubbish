/**
 * State pattern using role interfaces as it 
 * conforms Interface Segregation Principle.
 */

package sss.dpstate_2.state;

import sss.dpstate_2.context.LoanContext;

public interface ICanDeny {
	void Deny(LoanContext loanContext);
}
