package org.sandeep.command;

public class RotateFan implements Command {

	private Fan fan;
	
	


	public RotateFan(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan= fan;
	}
	


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.fan.rotateFan();
	}

}
