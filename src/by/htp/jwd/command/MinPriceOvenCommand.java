package by.htp.jwd.command;

import by.htp.jwd.command.exception.CommandException;
import by.htp.jwd.service.ServiceFactory;
import by.htp.jwd.service.exception.ServiceException;

public class MinPriceOvenCommand implements Command{

	@Override
	public String executeCom() throws CommandException {
		
		String result = "";
		try {
			result = ServiceFactory.getInstance().getMinPriceService().minPriceOver();
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		return result;
	}
	
}
