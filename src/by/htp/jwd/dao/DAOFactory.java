package by.htp.jwd.dao;

public class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private GetDataDAO getDataDAO = new GetDataDAOImp();	

	public DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public GetDataDAO getGetDataDAO() {
		return getDataDAO;
	}

	
	
}
