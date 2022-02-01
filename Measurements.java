package basics;

import java.util.Scanner;

public class Measurements {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		double width,height,side,Area,Perimeter;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Width of a Rectangele = ");
		width = sc.nextDouble();
        System.out.println("Please Enter the height of a Rectangle = ");		
		height = sc.nextDouble();
        System.out.println("please enter  the side of a Square = ");
        side = sc.nextDouble();
        Area = width * height;
        Perimeter = 2 * (width + height);
        Area = side * side;
        Perimeter = 4 * side;
        System.out.println("The Area of a Rectangle = " + Area);
        System.out.println("The Perimeter of a Rectangle= " + Perimeter);
        System.out.println("The Area of a Square = "+ Area);
        System.out.println("The Perimeter of a Square = "+ Perimeter);
        
        
        
        
        	
	}

}
