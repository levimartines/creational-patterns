package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;
		if ("X".equals(generation)) {
			device = "standard".equals(level) ? new IPhoneX() : new IPhoneXSMax();
		} else if (generation.equals("11")) {
			device = "standard".equals(level) ? new IPhone11() : new IPhone11Pro();
		}
		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}
		return device;
	}
}
