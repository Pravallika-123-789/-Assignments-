package basics;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		
		if(num % 5 == 0)
		{
			System.out.println(num+ "is divisible");
			
		}
		else
			System.out.println(num+ "is  not divisible");
		
			
	}

}
