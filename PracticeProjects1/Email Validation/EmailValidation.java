package com.emailproject;


import java.util.Scanner;
public class EmailValidation {
			public static void main(String[] args) {  
            String[] strArray = { "samyuktha@mphasis.com", 
            		"sonam@simplilearn.com",
            		"aarthi@gmail.com",
            		"bharthi@gmail.com",
            		"sahil@gmail.com",
            		"pavan@reddif.com"};  
            boolean x = false; 
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Email Id");
            String s = sc.nextLine();
            for (int i = 0; i < strArray.length; i++) {  
            	if(s.equals(strArray[i])) {  
            		x = true; break;  
                	}  
            	}  
            if(x)  
            	System.out.println(s +" is a valid Email id");  
            else  
            	System.out.println(s +" is a invalid Email id");                                    
	  }
}

			


