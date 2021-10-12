package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {
        //CountryRulesAbstractFactory rules = new USRulesFactory();
        CountryRulesAbstractFactory rules = new BrazilianRulesFactory();

        IPhoneFactory iPhone11Factory = new IPhone11Factory(rules);
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory(rules);

        System.out.println("### Ordering an iPhone 11");
        IPhone iPhone11 = iPhone11Factory.orderIPhone("standard");
        System.out.println(iPhone11);

        System.out.println("### Ordering an iPhone X");
        IPhone iPhoneX = iPhoneXFactory.orderIPhone("standard");
        System.out.println(iPhoneX);
    }
}
