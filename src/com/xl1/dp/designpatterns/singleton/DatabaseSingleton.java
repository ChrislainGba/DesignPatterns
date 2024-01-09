package com.xl1.dp.designpatterns.singleton;

public class DatabaseSingleton {
	
	private static DatabaseSingleton databaseSingletonInstance;
	
	private DatabaseSingleton() {
		
	}
	
	public static  DatabaseSingleton getInstance() {
		if(databaseSingletonInstance !=null) {
			return databaseSingletonInstance;
		}else {
			databaseSingletonInstance = new DatabaseSingleton();
			return databaseSingletonInstance;
		} 
	}
	
	

}
