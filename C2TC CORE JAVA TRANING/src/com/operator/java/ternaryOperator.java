package com.operator.java;

public class ternaryOperator {

	public static void main(String[] args) {
				
		int a=52,b=21,c=32,k;
		
		k= (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println(k);
	}

}
