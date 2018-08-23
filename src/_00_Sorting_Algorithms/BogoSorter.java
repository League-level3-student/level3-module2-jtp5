package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {

	Random r;

	public BogoSorter() {
		type = "Bogo";
		r = new Random();
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		if (!inOrder(array)) {
			int first = r.nextInt(array.length);
			int second = r.nextInt(array.length);
			int holder = array[first];
			array[first] = array[second];
			array[second] = holder;
			display.updateDisplay();
			sort(array, display);
		}
	}

	boolean inOrder(int[] array) {
		boolean sorted = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				sorted = false;
			}
		}
		return sorted;
	}
}
