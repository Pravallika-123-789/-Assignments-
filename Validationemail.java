package stringdemo;

import java.util.Scanner;

public class Validationemail {

	public static void main(String[] args) {
		Boolean flag = false;
		String emails[]=new String[5];
		emails[0]="pravallika01@gmail.com";
        emails[1]="pravallika22@gmail.com";
        emails[2]="pravallika31@gmail.com";
        emails[3]="pravallikagv@gmail.com";
        emails[4]="pravallikagvn@gmail.com";
        
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter your email:");
        String userEmail=sc.next();
        
        for(String email:emails)
        {
        	if(userEmail.matches(email))
        	{
        		System.out.println("Welcome back" + userEmail);
        		flag=true;
        		break;
        		
        	}
        }
	   if(flag==false)
	   {
		   System.out.println("Invalid User");
	   }
		
	
	
		
	
	}

}
