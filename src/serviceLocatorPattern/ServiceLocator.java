package serviceLocatorPattern;

public class ServiceLocator {

	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static SortingAlgorithmService getSortingAlgorithmService(String name) {
		SortingAlgorithmService algorithm = cache.getSortingAlgorithmService(name);
		
		if (algorithm != null) {
			return algorithm;
		}
		
		InitialContext context = new InitialContext();
		SortingAlgorithmService BubbleSortService = (SortingAlgorithmService)context.lookup(name);
		cache.addSortingAlgorithmService(BubbleSortService);
		return BubbleSortService;
	}

}
