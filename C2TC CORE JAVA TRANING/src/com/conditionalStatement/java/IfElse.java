package com.conditionalStatement.java;

public class ifElse {

	public static void main(String[] args) {
		
		// First if else loop
		int x = 5;
		
        if(x == 5)
        
      	  System.out.println("Value of x is 5");
        
        else
        
        System.out.println("Value of x is not 5");
        
     // Second if else loop
        
    	int  y = 7; 
    	
    	x=11;
    	
        if(x >= y)  // 11>=7 Statement is true 
         
     	   System.out.println("true"); // 
        
        else
        
     	   System.out.println("false");
        
     // Third if else loop

        if(!(x < y) || (x == y))  // !(10<11) or (10 == 11)    ! = Not  so !(10<11) means is false
		   
			  System.out.println("Condition is TRUE");
		  
		else
		  
			  System.out.println("Condition is FALSE"); 

	// Fourth if else loop
		  
		int ageOfBoy = 27;
		
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) // && = and 
				
			System.out.println("You want to get marry?");
				 
		else 
				
			System.out.println("Wait for it nibba nibbi ");
				

	}

}
