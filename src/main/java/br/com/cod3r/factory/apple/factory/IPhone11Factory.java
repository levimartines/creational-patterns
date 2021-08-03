package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone() {
		return new IPhone11();
	}
}
