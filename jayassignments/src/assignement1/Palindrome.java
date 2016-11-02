package assignement1;

import java.util.InputMismatchException;
import java.util.Scanner;     // importing scanner class

public class Palindrome {
	
	
	
	public static void palin() 
	{
		 try               // starting try block
		 {
			 int rev=0;
		 
		Scanner sc = new Scanner(System.in);      //using scanner to enter the number
		System.out.println("Enter the number to check palindrome or not:");
		int num= sc.nextInt();
		int num1=num;                        // initializing a temporary variable
		while(num !=0)
		{
			rev = rev*10;
			rev = rev+ num%10;            //using mod
			num = num/10;
		}
		
		if(rev == num1)
			System.out.println("This number is a palindrome");    //if-else Loop
		
		else
			System.out.println("This number is not a palindrome");
		sc.close();
		 }
	
		 catch(InputMismatchException e)
		 {
			 System.out.println("checked Exception occured:"+e);
		 }
		
		
	}
	public static void main(String args[])
	{
		palin();
	}

}
