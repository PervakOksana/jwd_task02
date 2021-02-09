package by.htp.jwd.service;

public class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private FindService findService = new FindServiceImp();
	private MinPriceService minPriceService = new MinPriceServiceImp();

	public ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public FindService getFindService() {
		return findService;
	}

	public MinPriceService getMinPriceService() {
		return minPriceService;
	}
	
	
}
