package method1;

public class Method {
	public void print()
	{
		System.out.println("Method without return type and without Para");
	}
	
	//method returning nothing with 1 Parameter
	public void display(String name)
	{
		System.out.println("My Name is "+name);
	}
	
	//method with return type and parameters
	public int cube(int n)
	{
		return n*n*n;
	}
	
	//method return string and with 2 Parameters
	public String fullName(String fname,String lname)
	{
		return fname+" "+lname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method obj=new Method();
		obj.display("Manoj");
		
		String name=obj.fullName("Prerna", "Patel");
		System.out.println("FullName is "+name);
		
		System.out.println(obj.cube(5));
		System.out.println("Full Name "+ obj.fullName("Parth", "Patel"));
		
		obj.print();

	}

}
