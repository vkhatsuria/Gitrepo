package com.vishal.balancepoint;

import java.util.Iterator;
import java.util.Set;

public class ArrayProcessorTest {

	public static void main(String[] args) {
		//int[] arr = {1,0,1,1};
		int[] arr = {12,-12,1,0};
		ArrayProcessor a = new ArrayProcessor();
		Set<Integer> balancepoints = a.findBalancePoints(arr);
		Iterator<Integer> itr = balancepoints.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
