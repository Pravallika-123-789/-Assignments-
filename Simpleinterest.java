package basics;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float p,r,t,sinterest;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the principal :");
     p = scan.nextFloat();
     System.out.println("Enter the Rate of interest :");
     r = scan.nextFloat();
     System.out.println("Enter the Time period :");
     t = scan.nextFloat();
     scan.close();
     sinterest = (p * r * t)/100;
     System.out.println("Simple Interest is: "+sinterest);
	}

}
