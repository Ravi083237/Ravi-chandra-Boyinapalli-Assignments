package com.strings;

public class DifferentStringMethods {

	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a", "$"));
		System.out.println(str.contains("collection"));
		System.out.println(str.equals("Java String pool refers to collection of strings which are stored in heap memory"));
		System.out.println(str.equalsIgnoreCase("Java String pool refers to collection of strings which are stored in heap memory"));
		// TODO Auto-generated method stub

	}

}
