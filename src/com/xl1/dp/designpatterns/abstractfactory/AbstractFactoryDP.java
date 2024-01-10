package com.xl1.dp.designpatterns.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class AbstractFactoryDP {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// Tnstanciation static de la fabrique
		AbstractFactory fact1 = new AbstractFactoryImpl1();
		AbstractPlugin plugin1 = fact1.getInstance();
		plugin1.operation();
		
		// Tnstanciation dynamique de la fabrique
		AbstractFactory fact2 = (AbstractFactory) Class.forName("com.xl1.dp.designpatterns.abstractfactory.AbstractFactoryImpl2").getDeclaredConstructor().newInstance();
		AbstractPlugin plugin2 = fact2.getInstance();
		plugin2.operation();

	}

}
