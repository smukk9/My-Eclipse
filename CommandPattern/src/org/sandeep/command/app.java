package org.sandeep.command;

/* Implement any functionality you want and its respective 
 * Dependency Injection class. E.g Light implements on and off methods
 * Turnoncommand will implement command interface and using 
 * DI it will execute on method in LIGHT class.
 * 
 * 
 * 
 */
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
