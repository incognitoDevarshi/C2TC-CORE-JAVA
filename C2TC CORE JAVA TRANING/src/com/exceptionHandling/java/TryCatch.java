package com.exceptionHandling.java;

public class TryCatch {

	public static void main(String[] args) {
		
		try { 
			//code that may raise exception
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException 
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		try{  
		        
			int data=100/0;  //ArithmeticException 	
		   }
		catch(ArithmeticException e)
		 	{
			   System.out.println(e);
		 	}  
		   //rest code of the program  
		  
		   System.out.println("rest of the code...");  
		   
		   
	}
	
}
