package com.vishal.balancepoint;

import java.util.HashSet;
import java.util.Set;

public class ArrayProcessor {

	public Set<Integer> findBalancePoints(int[] array) {
		Set<Integer> balancePoints = new HashSet<>();
		int product = 1, sum = 0;
		int arrLength = array.length;
		if (array.length != 0) {
			for (int i = 0; i < arrLength; i++) {

				for (int j = i + 1; j < arrLength; j++) {
					product = product * array[j];
				}

				for (int k = 0; k < i; k++) {
					sum = sum + array[k];
				}
				
				
				System.out.println("test for pull request");
				product = 1;
				sum = 0;
			}
		}
		return balancePoints;
	}

}
