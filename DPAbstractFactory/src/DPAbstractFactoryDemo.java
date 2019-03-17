import sss.dpabstractfactory.phone.AbstractPhoneFactory;
import sss.dpabstractfactory.phone.IPhone;
import sss.dpabstractfactory.phone.IPhoneFactory;
import sss.dpabstractfactory.phone.TypeOfPhone;
import sss.dpabstractfactory.phone.TypeOfPhoneFactory;

public class DPAbstractFactoryDemo {
	public static void main(String[] args) {
		IPhoneFactory iPhoneFactory = AbstractPhoneFactory.getPhoneFactory(TypeOfPhoneFactory.SAMSUNG);
		IPhone iPhone = iPhoneFactory.getPhone(TypeOfPhone.SINGLE_SIM);
		iPhone.showPhoneProperties();
	}
}
