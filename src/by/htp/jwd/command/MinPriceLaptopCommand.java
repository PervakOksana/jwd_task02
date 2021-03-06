package by.htp.jwd.command;

import by.htp.jwd.command.exception.CommandException;
import by.htp.jwd.service.ServiceFactory;
import by.htp.jwd.service.exception.ServiceException;

public class MinPriceLaptopCommand implements Command {

	@Override
	public String executeCom() throws CommandException {

		String result = "";
		try {
			result = ServiceFactory.getInstance().getMinPriceService().minPriceLaptop();
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		return result;
	}

}
