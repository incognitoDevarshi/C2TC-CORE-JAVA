package com.string.java;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter a sentence ");
//		String str = s.nextLine();
//		
//		//Char
//		char ch=str.charAt(4); //returns the char value at the 4th index  
//		System.out.println(ch);  
		
		//Concat
		String str1 = "Hello ";  
        String str2 = "Devarshi ";  
        String str3 = "Tandel";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
        
        //substring
        String s1="Devarshi";  
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,3));
        
        
	}

}
