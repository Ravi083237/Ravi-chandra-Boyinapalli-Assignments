package com.datastructures;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter subject1 marks :");
		int s1= sc.nextInt();
		System.out.println("Enter subject2 marks :");

		int s2 = sc.nextInt();
		System.out.println("Enter subject3 marks :");

		int s3 = sc.nextInt();
		if(s1>=60&s2>=60&s3>=60) {
			System.out.println("Passed");
		}else if((s1>=60&s2>=60)|(s2>=60&s3>=60)|(s1>=60&s3>=60)){
			System.out.println("Promoted");
			
		}else {
			System.out.println("Failed");
		}
		

	}

}
