package com.xl1.dp.designpatterns.adapter;

public class AssignmentWork {
	Pen p;
	
	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String str) {
		p.write(str);
	}
}
