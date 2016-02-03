package org.sandeep.command;

public class app {
	
	public static void main(String args[]){
		
		Light light = new Light();
		Turnoffcommand off = new Turnoffcommand(light);
		Turnoncommand on = new Turnoncommand(light);
		Fan fan = new Fan();
		RotateFan rotate = new RotateFan(fan);
		StopFan stop = new StopFan(fan);
		
		
		Switcher sw = new Switcher();
		sw.addcommand(off);
		sw.addcommand(on);
		sw.addcommand(rotate);
		sw.addcommand(stop);
		sw.executeCommand();
		sw.giveCommand(rotate);
	}

}
