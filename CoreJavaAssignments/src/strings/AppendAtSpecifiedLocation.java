package com.strings;

public class AppendAtSpecifiedLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("it is used to _ at the specified index position");
		System.out.println(buffer.indexOf("_"));
		buffer.replace(14, 15, "insert text ");
		System.out.println(buffer);

	}

}
