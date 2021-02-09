package by.htp.jwd.service;

import by.htp.jwd.service.exception.ServiceException;

public interface MinPriceService {
	
	public  String minPriceOver () throws ServiceException;
	public  String minPriceLaptop () throws ServiceException;
	public  String minPriceRefrigerator () throws ServiceException;
}
