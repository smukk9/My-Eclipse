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
	
	public void giveCommand(Command command){
		for(Command x : this.listofcommands){
			if(x.equals(command)){
				command.execute();
				System.out.println("This is:"+command.getClass());
			}
		}
		
	}
	public void executeCommand(){
		
		for(Command c : this.listofcommands){
			
			c.execute();
		}
	}
}
