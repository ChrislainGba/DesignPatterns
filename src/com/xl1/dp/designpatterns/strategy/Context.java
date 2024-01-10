package com.xl1.dp.designpatterns.strategy;

public class Context {
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void appliquerStrategy() {
		strategy.operationStrategy();
	}
	
	
}
