package com.conditionalStatement.java;

public class SwitchCase {

	public static void main(String[] args) {
		
		int	 x=78;
		
		switch (x/10)  // x = 78
		{
		case 10: 
		case 9: 
		case 8: 
			System.out.println("Extra ordinary Grade");
			break;
		case 7:
			System.out.println("First Class Garde");
			break;
		case 6:
			System.out.println("Second Class Grade");
			break;
		case 5:
			System.out.println("Pass Class Grade");
			break;
		default:
		System.out.println("You Fail in Exam");
		
		}

	}

}
