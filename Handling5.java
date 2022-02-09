package exceptionhandling;

public class Handling5 {
	
	static void check(int age) throws Exception
		{
			if(age<18)
				throw new Exception("Not valid age exception");
			else
				System.out.println("Valid User");
		}
		
		static void test() throws Exception
		{
			check(14);
		}
		
		public static void main(String[] args) {
			
			try {
				test();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}

}
