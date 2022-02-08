package array;

public class ArrayDemo {

public static void main(String[] args) {
		
		int array[]= {15,33,54,65,76,97,108};
		
		System.out.println("Element at index 4 "+array[4]);
		
		System.out.println("Length of an array "+array.length);
		
		System.out.println("access same using for loop");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ,");
		}
		System.out.println();
		System.out.println("access same using for each loop");
		for(int a :array)
		{
			System.out.print(a+" ,");
		}
	}

}
