package com.xl1.dp.designpatterns.command;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
	private Map<String, Command> commands = new HashMap<>();
	
	public void addCommand(String ref, Command cmd) {
		commands.put(ref, cmd);
	}
	
	public void invoquer(String ref) {
		Command cmd = commands.get(ref);
		if(cmd!=null) {
			cmd.excercute();
		}
	}
}
