package com.datastructures;

import java.util.Arrays;

public class FindElementBubbleSort {
	 static void bubbleSortAlgorithm(int a[]) {
		int len = a.length-1;
     for(int i=0;i<len;i++) {
			boolean swapped = false;
			for(int j =0;j < len-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped = true;
					
				}
			}
			if(!swapped) {
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		int[] b = {6,4,3,1,2,25,55,2};
		bubbleSortAlgorithm(b);
		
		System.out.println(Arrays.toString(b));
		
		// TODO Auto-generated method stub

	}

}
