package com.xl1.dp.designpatterns.strategy;

//Lorsqu'il est nécessaire de définir une famille d'algorithmes, les encapsuler et les rendre interchangeables.
public class StrategyDP {
	public static void main(String[] args) {
		Context ctx = new Context();
		System.out.println("=======stategy1");
		Strategy strat1 = new StrategyImpl1();
		ctx.setStrategy(strat1);
		ctx.appliquerStrategy();
		
		System.out.println("=======stategy2========");
		Strategy strat2 = new StrategyImpl2();
		ctx.setStrategy(strat2);
		ctx.appliquerStrategy();
		
	}
}
