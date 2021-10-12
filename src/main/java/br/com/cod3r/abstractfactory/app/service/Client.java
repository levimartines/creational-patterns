package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class  Client {

	public static void main(String[] args) {

		ServicesAbstractFactory servicesFactory = new RestFactory();
		CarService carService = servicesFactory.getCarService();
		carService.save("ix35");
		carService.update("BMW");

		UserService userService = servicesFactory.getUserService();
		userService.save("Joaquim");
		userService.delete(1);
	}
}
