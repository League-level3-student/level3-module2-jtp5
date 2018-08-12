package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] nums) {
		boolean outcome = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				outcome = false;
			}
		}
		return outcome;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] nums) {
		boolean outcome = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				outcome = false;
			}
		}
		return outcome;
	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	public static boolean charArraySorted(char[] chars) {
		boolean outcome = true;
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] > chars[i + 1]) {
				outcome = false;
			}
		}
		return outcome;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

	public static boolean stringArraySorted(String[] words) {
		boolean outcome = true;
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].compareTo(words[i + 1]) > 0) {
				outcome = false;
			}
		}
		return outcome;
	}

}
