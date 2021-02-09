package by.htp.jwd.service;

import java.util.ArrayList;

import by.htp.jwd.dao.DAOFactory;
import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Laptop;
import by.htp.jwd.entity.Oven;
import by.htp.jwd.entity.Refrigerator;
import by.htp.jwd.entity.Thing;
import by.htp.jwd.service.exception.ServiceException;

public class MinPriceServiceImp implements MinPriceService {

	@Override
	public String minPriceOver() throws ServiceException {
		try {
			ArrayList<Thing> ovensd = DAOFactory.getInstance().getGetDataDAO().getDataOver();

			Oven ovenMin = (Oven) ovensd.get(0);
			double min = ovenMin.getPrice();
			Oven term = new Oven();

			for (int i = 0; i < ovensd.size(); i++) {

				term = (Oven) ovensd.get(i);

				if (term.getPrice() < min) {
					min = term.getPrice();
					ovenMin = term;
				}
			}
			return ovenMin.toString();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public String minPriceLaptop() throws ServiceException {
		try {
			ArrayList<Thing> laptops = DAOFactory.getInstance().getGetDataDAO().getDataLaptop();

			Laptop laptopMin = (Laptop) laptops.get(0);
			double min = laptopMin.getPrice();
			Laptop term = new Laptop();

			for (int i = 0; i < laptops.size(); i++) {

				term = (Laptop) laptops.get(i);

				if (term.getPrice() < min) {
					min = term.getPrice();
					laptopMin = term;
				}
			}
			return laptopMin.toString();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public String minPriceRefrigerator() throws ServiceException {
		try {
			ArrayList<Thing> refrigerators = DAOFactory.getInstance().getGetDataDAO().getDataRefrigerator();

			Refrigerator refrigeratorMin = (Refrigerator) refrigerators.get(0);
			double min = refrigeratorMin.getPrice();
			Refrigerator term = new Refrigerator();

			for (int i = 0; i < refrigerators.size(); i++) {

				term = (Refrigerator) refrigerators.get(i);

				if (term.getPrice() < min) {
					min = term.getPrice();
					refrigeratorMin = term;
				}
			}
			return refrigeratorMin.toString();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
