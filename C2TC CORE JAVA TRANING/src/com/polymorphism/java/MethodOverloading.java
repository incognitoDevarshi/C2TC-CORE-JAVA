package com.polymorphism.java;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Area of Sqaure is "+ area(5));
		System.out.println("Area of Rectangle is "+ area(5,4));
	}
	public static int area(int a,int b) {
		return a*b;
	}
	public static int area(int a) {
		return a*a;
	}
}
