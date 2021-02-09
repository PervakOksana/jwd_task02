package by.htp.jwd.service;

import by.htp.jwd.dao.DAOFactory;
import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Thing;
import by.htp.jwd.service.exception.ServiceException;

public class FindServiceImp implements FindService {

	@Override
	public String findOver() throws ServiceException {

		String strOven = "";
		try {
			for (Thing thing : DAOFactory.getInstance().getGetDataDAO().getDataOver()) {

				strOven = strOven + thing + "\n";
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return strOven;
	}

	@Override
	public String findLaptop() throws ServiceException {

		String strLaptop = "";
		try {
			for (Thing thing : DAOFactory.getInstance().getGetDataDAO().getDataLaptop()) {

				strLaptop = strLaptop + thing + "\n";
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return strLaptop;

	}

	@Override
	public String findRefrigerator() throws ServiceException {

		String strRefrigerator = "";
		try {
			for (Thing thing : DAOFactory.getInstance().getGetDataDAO().getDataRefrigerator()) {

				strRefrigerator = strRefrigerator + thing + "\n";
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return strRefrigerator;

	}

	@Override
	public String findAll() throws ServiceException {

		String strAll = "";
		try {
			for (Thing thing : DAOFactory.getInstance().getGetDataDAO().getDataAll()) {

				strAll = strAll + thing + "\n";
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return strAll;

	}

}
