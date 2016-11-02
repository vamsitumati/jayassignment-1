package assignement1;

public class Fibonacci {              // creating a class
	private static int num1=0;
	private static int num2 =1;           // creating a static variables to use in static method
	private static int num3;
	
	public static void fibMethod()        // creating a static method which returns nothing
	{
		System.out.println("The Fibonacci numbers are:");
		System.out.print(num1+","+num2+",");
		for(int i=1; i<10; i++)             // starting For loop
		{
			num3 = num1+num2;
			num1 = num2;                    // operations
			num2 = num3;
			System.out.print(num3+",");  // printing the values
		}
		
		
	}
	
	public static void main(String args[])    // main method
	{
		fibMethod();    // calling static method 
		               // since it is a static method, no need to create a object for class 
	}
	

}
