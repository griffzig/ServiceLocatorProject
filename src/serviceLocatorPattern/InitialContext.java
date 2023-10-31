package serviceLocatorPattern;

// Check context for Bubble Sort & Selection Sort
public class InitialContext {
	
	public Object lookup(String name) {
		if (name.equalsIgnoreCase("Bubble Sort Service")) {
			
			System.out.println("Sorting the array with Bubble Sort");
			
			return new BubbleSortService();
		} else if (name.equalsIgnoreCase("Selection Sort Service")) {
			
			System.out.println("Sorting the array with Selection Sort");
		}
		
		return null;
	}
	
}
