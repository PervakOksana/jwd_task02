package by.htp.jwd.dao;

import java.util.ArrayList;

import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Thing;

public interface GetDataDAO  {
	
	public ArrayList<Thing> getDataOver() throws DAOException;
	public ArrayList<Thing> getDataLaptop() throws DAOException;
	public ArrayList<Thing> getDataRefrigerator() throws DAOException;
	public ArrayList<Thing> getDataAll() throws DAOException;
}
