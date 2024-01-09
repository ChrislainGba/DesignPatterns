package com.xl1.dp.designpatterns.factory;

public class OsFactory {
	
	public OS getInstance(String os) {
		if(os.equals("mac")) {
			return new Mac();
		}else if(os.equals("windows")) {
			return new Windows();
		}else if(os.equals("android")) {
			return new Android();
		}else {
			return new Linux();
		}
	}
}
