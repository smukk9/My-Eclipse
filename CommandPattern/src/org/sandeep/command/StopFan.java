package org.sandeep.command;

public class StopFan implements Command {
	
	private Fan fan ;
	public StopFan(Fan fan){
		this.fan= fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.fan.stopFan();
	}

}
