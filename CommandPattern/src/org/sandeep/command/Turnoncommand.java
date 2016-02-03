package org.sandeep.command;

public class Turnoncommand implements Command {

	private Light light;
	
	public Turnoncommand(Light light){
		
		this.light = light;
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.turnOn();

	}
	

}
