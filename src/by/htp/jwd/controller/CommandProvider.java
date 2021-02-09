package by.htp.jwd.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.jwd.command.Command;
import by.htp.jwd.command.FindAllCommand;
import by.htp.jwd.command.FindLaptopCommand;
import by.htp.jwd.command.FindOverCommand;
import by.htp.jwd.command.FindRefrigeratorCommand;
import by.htp.jwd.command.MinPriceLaptopCommand;
import by.htp.jwd.command.MinPriceOvenCommand;
import by.htp.jwd.command.MinPriceRefrigeratorCommand;

public class CommandProvider {
	final private Map<String, Command> commands = new HashMap<>();

	CommandProvider() {
		commands.put("1", new FindAllCommand());
		commands.put("2", new FindLaptopCommand());
		commands.put("3", new FindOverCommand());
		commands.put("4", new FindRefrigeratorCommand());
		commands.put("5", new MinPriceLaptopCommand());
		commands.put("6", new MinPriceOvenCommand());
		commands.put("7", new MinPriceRefrigeratorCommand());
		
	}
	
	Command getCommand(String commandName)  {
		Command command = commands.get(commandName);
		if (command == null) {
					}
		return command;
	}
}
