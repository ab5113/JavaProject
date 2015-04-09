package com.java.array;

public class FindMaxElement {

	public static void main(String[] args) {
		// int[] arr= new int[10];
		int[] arr = { 1, 7, 5, 5, 5, 6, 8, 9 };
		int result = 0;
		FindMaxElement Max = new FindMaxElement();
		result = Max.getMaxElement(arr);
		System.out.println(result);
	}

	int getMaxElement(int[] arr) {
		int a = 0;

		for (int i = 0; i < arr.length; i++) {

			if (a < arr[i])
				a = arr[i];
		}

		return a;

	}

}
