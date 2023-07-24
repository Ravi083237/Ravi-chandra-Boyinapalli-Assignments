package com.strings;

public class ReplaceStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("it is used to _ at the specified index position");
		System.out.println(stringbuilder.indexOf("_"));
		stringbuilder.replace(14, 15, "insert text ");
		System.out.println(stringbuilder);
		// TODO Auto-generated method stub

	}

}
