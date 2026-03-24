package main.Arrays;

import java.util.Arrays;

//TO SORT THE ARRAY
public class ArraysQuestion1 {
	
	public int[] sortedArray() {
		int[] arr= {23, 67, 54, 11, 10, 9};
		
		 Arrays.sort(arr);
		 
		 return arr;
	}
	
	public int findTheElement(int element) {
		int[] arr = {9, 10, 11, 23, 54, 67};
		
		int index = Arrays.binarySearch(arr, element);
		
		return index+ 1;
	}

}
