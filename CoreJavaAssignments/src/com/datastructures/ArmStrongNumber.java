package com.datastructures;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num=number;
		int sum = 0,temp;
		
		while(number!=0) {
			temp=number%10;
			sum = sum +(temp*temp*temp);
			number = number/10;
			
		}
		if (num==sum) {
			System.out.println("The given number is an ArmStrong number");
		}else {
			System.out.println("The given number is Not an ArmStrong number");
		}
		

	}

}
