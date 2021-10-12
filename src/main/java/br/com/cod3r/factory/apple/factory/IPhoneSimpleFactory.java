package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {
        IPhone device = null;
        if (isIphoneX(generation)) {
            device = isStandard(level) ? new IPhoneX() : new IPhoneXSMax();
        } else if (generation.equals("11")) {
            device = isStandard(level) ? new IPhone11() : new IPhone11Pro();
        }
        if (device != null) {
            prepare(device);
        }
        return device;
    }

    private static void prepare(IPhone device) {
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
    }

    private static boolean isIphoneX(String generation) {
        return "X".equals(generation);
    }

    private static boolean isStandard(String level) {
        return "standard".equals(level);
    }
}
