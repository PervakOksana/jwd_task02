package by.htp.jwd.controller;

import by.htp.jwd.command.Command;
import by.htp.jwd.command.exception.CommandException;

public class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	
	public String doAction(String request) {
		
		
		String commandName = request.split("\\s+")[0];
		String response= "";
	
		try {
			Command command = provider.getCommand(commandName);
			response = command.executeCom();
		} catch (CommandException e) {
			response = "Wrong";
		}
		
		return response;
		
	}
}
