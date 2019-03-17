package sss.dpabstractfactory.phone;

public class AbstractPhoneFactory {
	
	private AbstractPhoneFactory() {}
	
	public static IPhoneFactory getPhoneFactory(TypeOfPhoneFactory typeOfPhoneFactory) {
		IPhoneFactory iPhoneFactory = null;
		if (typeOfPhoneFactory == TypeOfPhoneFactory.SAMSUNG) {
			iPhoneFactory = new SamsungPhoneFactory();
		} else if (typeOfPhoneFactory == TypeOfPhoneFactory.APPLE) {
			iPhoneFactory = new ApplePhoneFactory();
		} else if (typeOfPhoneFactory == TypeOfPhoneFactory.MI) {
			iPhoneFactory = new MiPhoneFactory();
		}
		
		return iPhoneFactory;
	}
}
