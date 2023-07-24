package com.datastructures;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter slab value :");
		long slab = sc.nextLong();
		if(slab>=0&slab<=180000) {
			System.out.println("No tax to Pay.");
		}else if(slab>180000&slab<=300000) {
			System.out.println("You have to pay tax of"+slab*0.1);
		}else if(slab>300000&slab<=500000) {
			System.out.println("You have to pay tax of"+slab*0.2);

		}else {
			System.out.println("You have to pay tax of"+slab*0.3);

		}
		// TODO Auto-generated method stub

	}

}
