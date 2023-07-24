package com.datastructures;

import java.util.Scanner;

public class FindInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		// TODO Auto-generated method stub
		int[] a= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				System.out.println(" The "+ num+" is find at index "+i);
			}
		}
	}
}
