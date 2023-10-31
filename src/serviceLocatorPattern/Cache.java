package serviceLocatorPattern;

import java.util.*;

// Cache class for storage

public class Cache {

	// Declare List for sorting algorithms
	public List<SortingAlgorithmService> algorithms;
	
	// Constructor
	public Cache() {
		
		// initialize ArrayList for sorting algorithms
		algorithms = new ArrayList<SortingAlgorithmService>();
		
	}
	
	public SortingAlgorithmService getSortingAlgorithmService(String algorithmName) {
		
		for (SortingAlgorithmService algorithm : algorithms) {
			if (algorithm.getName().equalsIgnoreCase(algorithmName)) {
				
				System.out.println("Returning cached " + algorithmName + " array");
				
				return algorithm;
			}
		}
		return null;
	}
	
	public void addSortingAlgorithmService(SortingAlgorithmService newAlgorithmService) {
		boolean exists = false;
		for (SortingAlgorithmService algorithm : algorithms) {
			if (algorithm.getName().equalsIgnoreCase(newAlgorithmService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			algorithms.add(newAlgorithmService);
		}
	}
	

}

