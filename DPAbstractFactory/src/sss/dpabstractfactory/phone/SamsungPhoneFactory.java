package sss.dpabstractfactory.phone;

public class SamsungPhoneFactory implements IPhoneFactory {
	
	@Override
	public IPhone getPhone(TypeOfPhone typeOfPhone) {
		IPhone iPhone = null;
		if (typeOfPhone == TypeOfPhone.SINGLE_SIM) {
			iPhone = new SingleSimPhone(TypeOfPhoneFactory.SAMSUNG);
		} else if (typeOfPhone == TypeOfPhone.DUAL_SIM) {
			iPhone = new DualSimPhone(TypeOfPhoneFactory.SAMSUNG);
		}
		
		return iPhone;
	}

}
