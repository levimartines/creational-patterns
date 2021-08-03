package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhone11Factory iPhone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone 11");
		IPhone iPhone = iPhone11Factory.orderIPhone();

	}
}
