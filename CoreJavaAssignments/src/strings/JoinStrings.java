package com.strings;

import java.util.Scanner;

public class JoinStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String str1=sc.nextLine();
		System.out.println("Enter Second String :");
		String str2=sc.nextLine();
		System.out.println(str1.concat(str2));

	}

}
