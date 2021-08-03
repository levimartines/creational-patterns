package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {
/*		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		System.out.println("### Ordering an iPhone 11");
		IPhone iPhone = iPhone11Factory.orderIPhone();*/

		IPhone device = IPhoneSimpleFactory.orderIPhone("11", "standard");
		System.out.println(device);
	}
}
