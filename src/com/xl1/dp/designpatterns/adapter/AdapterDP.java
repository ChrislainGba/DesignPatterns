package com.xl1.dp.designpatterns.adapter;

public class AdapterDP {

	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		Pen pa = new PenAdapter();
		aw.setP(pa);
		aw.writeAssignment("wrinting assignment");

	}

}
