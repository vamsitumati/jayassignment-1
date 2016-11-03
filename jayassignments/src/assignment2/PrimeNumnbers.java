package assignment2;
import java.util.Scanner;

public class PrimeNumnbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of 'n'");
       int n = sc.nextInt();
      
       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
     sc.close();
      
       System.out.println(primeNumbers);
   }
}