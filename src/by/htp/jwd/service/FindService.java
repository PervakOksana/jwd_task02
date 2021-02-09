package by.htp.jwd.service;

import by.htp.jwd.service.exception.ServiceException;

public interface FindService {

	public  String findOver () throws ServiceException;
	public  String findLaptop () throws ServiceException;
	public  String findRefrigerator () throws ServiceException;
	public  String findAll () throws ServiceException;
}
