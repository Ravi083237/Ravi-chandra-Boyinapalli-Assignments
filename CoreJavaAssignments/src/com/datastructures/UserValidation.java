package com.datastructures;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		String username = "Ravi chandra";
		String password = "Ravi2092";
		Scanner sc= new Scanner(System.in);
		 int attempts=0;
		 while(attempts<3) {
			 System.out.println("Enter username:");
			 String name = sc.nextLine();
			 System.out.println("enter password:");
			 String pass = sc.nextLine();
			 if(name.equals(username)&pass.equals(password)) {
				 System.out.println("Welcome"+username);
			 }else {
				 System.out.println("invalid credentials");
				 attempts++;
			 }
			 if(attempts==3) {
				 System.out.println("contact administrator");
			 }
		 }
		// TODO Auto-generated method stub

	}

}
