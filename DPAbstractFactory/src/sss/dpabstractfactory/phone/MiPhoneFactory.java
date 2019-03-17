package sss.dpabstractfactory.phone;

public class MiPhoneFactory implements IPhoneFactory{

	@Override
	public IPhone getPhone(TypeOfPhone typeOfPhone) {
		IPhone iPhone = null;
		if (typeOfPhone == TypeOfPhone.SINGLE_SIM) {
			iPhone = new SingleSimPhone(TypeOfPhoneFactory.MI);
		} else if (typeOfPhone == TypeOfPhone.DUAL_SIM) {
			iPhone = new DualSimPhone(TypeOfPhoneFactory.MI);
		}
		
		return iPhone;
	}
}
