package org.sandeep.command;

import java.util.ArrayList;
import java.util.List;

//invoker: everything happens from this switcher. 
public class Switcher {

	public List<Command> listofcommands;
	
	public Switcher(){
		this.listofcommands = new ArrayList<>();
	}
	
	public void addcommand(Command command){
		
		this.listofcommands.add(command);
	}
	
	public void executeCommand(){
		
		for(Command c : this.listofcommands){
			
			c.execute();
		}
	}
}
