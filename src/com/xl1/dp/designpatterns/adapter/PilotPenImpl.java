package com.xl1.dp.designpatterns.adapter;

public class PilotPenImpl implements PilotPen{
	
	@Override
	public void mark(String str) {
		System.out.println(str);
	}
}
