package com.xl1.dp.designpatterns.adapter;

public class PenAdapter implements Pen{
	PilotPen pp = new PilotPenImpl();

	@Override
	public void write(String str) {
		pp.mark(str);
		
	}
	

}
