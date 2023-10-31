package serviceLocatorPattern;

public class ServiceLocatorPatternDriver {

	public static void main(String[] args) {
		SortingAlgorithmService algorithm = ServiceLocator.getSortingAlgorithmService("Bubble Sort Service");
		int[] unsortedArray = {3, 7, 9, 4, 1, 2};
		
		// Sort the array using Bubble Sort and print results
		algorithm.sort(unsortedArray);
		System.out.println(algorithm.sortedArray());
		
		// Sort the array using Bubble Sort and print results
		algorithm = ServiceLocator.getSortingAlgorithmService("Selection Sort Service");
		algorithm.sort(unsortedArray);
		System.out.println(algorithm.sortedArray());
		
		// return cached Bubble Sort object
		algorithm = ServiceLocator.getSortingAlgorithmService("Bubble Sort Service");
		algorithm.sort(unsortedArray);
		System.out.println(algorithm.sortedArray());
		
		// return cached Selection Sort Object
		algorithm = ServiceLocator.getSortingAlgorithmService("Selection Sort Service");
		algorithm.sort(unsortedArray);
		System.out.println(algorithm.sortedArray());
		
	}

}
