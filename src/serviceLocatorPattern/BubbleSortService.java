package serviceLocatorPattern;

public class BubbleSortService implements SortingAlgorithmService {
	
	@Override
	public void sort(int[] array) {
		// Bubble Sort implementation
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap temp with array[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	public String getName() {
		
		return "Bubble Sort Service";
	}
	
	public int[] sortedArray() {
		
		return sortedArray();
	}
}
