package sss.dpabstractfactory.phone;

public class ApplePhoneFactory implements IPhoneFactory {

	@Override
	public IPhone getPhone(TypeOfPhone typeOfPhone) {
		IPhone iPhone = null;
		if (typeOfPhone == TypeOfPhone.SINGLE_SIM) {
			iPhone = new SingleSimPhone(TypeOfPhoneFactory.APPLE);
		} else if (typeOfPhone == TypeOfPhone.DUAL_SIM) {
			iPhone = new DualSimPhone(TypeOfPhoneFactory.APPLE);
		}
		
		return iPhone;
	}
}
