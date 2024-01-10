package com.xl1.dp.designpatterns.abstractfactory;

public class AbstractFactoryImpl1 implements AbstractFactory{

	@Override
	public AbstractPlugin getInstance() {
		// TODO Auto-generated method stub
		return new AbstractPluginImpl1();
	}

}
