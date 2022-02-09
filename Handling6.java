package exceptionhandling;

public class Handling6{
	
   static void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not valid age exception");
		else
			System.out.println("Valid User");
	}
	
	public static void main(String[] args) {
		
		check(6); 

}
}
