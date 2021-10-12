package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserEJBService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class RestFactory implements ServicesAbstractFactory {

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }
}
