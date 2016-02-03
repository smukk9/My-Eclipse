package org.sandeep.command;

public class app {
	
	public static void main(String args[]){
		
		Light light = new Light();
		Turnoffcommand off = new Turnoffcommand(light);
		Turnoncommand on = new Turnoncommand(light);
		
		Switcher sw = new Switcher();
		sw.addcommand(off);
		sw.addcommand(on);
		sw.executeCommand();
		
	}

}
