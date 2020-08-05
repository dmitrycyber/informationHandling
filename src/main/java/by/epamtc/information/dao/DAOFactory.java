package by.epamtc.information.dao;


import by.epamtc.information.dao.impl.CustomFileReaderImpl;
import by.epamtc.information.dao.impl.InformationDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	private final InformationDAO informationDAO = new InformationDAOImpl();
	private final CustomFileReader customFileReader = new CustomFileReaderImpl();
	
	private DAOFactory() {}

	public InformationDAO getInformationDAO() {
		return informationDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public CustomFileReader getCustomFileReader() {
		return customFileReader;
	}
}
