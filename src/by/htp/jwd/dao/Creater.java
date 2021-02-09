package by.htp.jwd.dao;

import java.util.ArrayList;

import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Thing;

public interface Creater {
 
	public ArrayList<Thing> execute( String data) throws DAOException;
	
}
