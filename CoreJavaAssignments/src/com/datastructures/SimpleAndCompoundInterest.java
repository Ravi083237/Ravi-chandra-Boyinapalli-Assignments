package com.datastructures;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		double p,r,t,si,ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal Value :");
		 p = sc.nextDouble();
		System.out.println("Enter Annual Rate of Interest:");
		 r = sc.nextDouble();
		System.out.println("Enter the time:");
		 t=sc.nextDouble();
		 si = (p *(t*12) * r)/100;
	     ci = p*Math.pow(1.0+r/100.0,(t*12)) - p;
	     System.out.println("Simple interest is "+ si);
	     System.out.println("compound interest is"+ ci);
		
		
		// TODO Auto-generated method stub

	}

}
