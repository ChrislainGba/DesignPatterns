package com.xl1.dp.designpatterns.abstractfactory;

public class AbstractFactoryImpl2 implements AbstractFactory{

	@Override
	public AbstractPlugin getInstance() {
		// TODO Auto-generated method stub
		return new AbstractPluginImpl2();
	}

}
