package com.datastructures;

public class AllArmStrongs {

	public static void main(String[] args) {
		int temp;
		
		
		// TODO Auto-generated method stub
		for(int i=100;1<=1000;i++) {
			int j=i;
			int sum =0;
			while(j!=0) {
				temp=j%10;
				sum = sum +(temp*temp*temp);
				j = j/10;
				
			}
			if(i==sum) {
				System.out.println(i);
			}else {
				continue;
			}
		}

	}

}
