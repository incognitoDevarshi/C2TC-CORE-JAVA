package com.string.java;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		
		String str = s.nextLine();
		
		System.out.println("what do you want to do with your sentence");
		System.out.println("1. lower case");
		System.out.println("2. Upper case");
		System.out.println("3. finding length");
		int x = s.nextInt();
		
		switch (x) 
		{
		case 1:
			System.out.println(str.toLowerCase());
			break;
		case 2:
			System.out.println(str.toUpperCase());
			break;
		case 3:
			System.out.println(str.length());
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
	//System.out.println(str);

	}

}
