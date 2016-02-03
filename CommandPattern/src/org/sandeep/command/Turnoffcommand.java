package org.sandeep.command;

public class Turnoffcommand implements Command {

	private Light light;
	
	Turnoffcommand(Light light){
		
		this.light = light;	
		}
	
	@Override
	public void execute(){
		
		this.light.turnOff();
	}
}
