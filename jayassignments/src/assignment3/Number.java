package assignment3;
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Number {
	public static void isort()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of size:");
		int n = sc.nextInt();
		
		
        System.out.println("Enter the values of size"+n+":");
        
       int[] in = new int[n];
		
		for(int i=0;i<n;i++)
		{
			
			
			int b =  sc.nextInt();
			
			in[i]=b;
			
		}
		
		System.out.println("The original values are:");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(in[i]+",");
			
		}
		Arrays.sort(in);
		System.out.println("\nSorted values are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(in[i]+",");
		}
		sc.close();
		
		
	}
	public static void dsort()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of size:");
		int n = sc.nextInt();
		
		
        System.out.println("Enter the values of size"+n+":");
        
       double[] d = new double[n];
		
		for(int i=0;i<n;i++)
		{
			
			
			Double b =  sc.nextDouble();
			
			d[i]=b;
			
		}
		
		System.out.println("The original values are:");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(d[i]+",");
			
		}
		Arrays.sort(d);
		System.out.println("\nSorted values are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(d[i]+",");
		}
		sc.close();
		
	}
	public  void ssort()
	{
		String b="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of size:");
		int n = sc.nextInt();
		
		String[] st = new String[n];
		
		
        System.out.println("Enter the strings of size"+n);
        
       
		System.out.println(st.length);
		for(int i=0;i<st.length;i++)
		{
			
			
			 b =  sc.nextLine();
			
			
			st[i]=b;
			
		}
		
		System.out.println("The original strings are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(st[i]);
		}
		Arrays.sort(st);
		System.out.println("\nSorted Strings  are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}
		
		sc.close();
		
	}
		public static void date()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of size:");
			int n = sc.nextInt();
			System.out.println("Enter the dates in yyyy-mm-dd format for"+" "+n+" "+"times");
			
			List<Date> list = new ArrayList<>(n);
			for(int i=1;i<=n;i++)
			{
				int b = sc.nextInt();
				list.add(new Date(b));
			}

			System.out.println("The original values are:"+list);
			/*Integer[] t = new Integer[n];
			list.toArray(t);
			Arrays.sort(t);*/
			Collections.sort(list);
			System.out.println("\nSorted values are:");
			for(int i=1;i<n;i++)
			{
				System.out.print(list);
			}
			sc.close();
		}
	
	 
	
	public static void main(String args[])
	{
		
	  System.out.println("Enter your choice\n 1.Integer \n 2.Double \n 3.String \n 4.Date");
      Scanner sc = new Scanner(System.in);
      int ch = sc.nextInt();
      switch(ch)
      {
      case 1:
    	  
    	  isort();
    	  break;
      case 2:
    	  
    	  dsort();
    	  break;
      case 3:
    	 
    	  Number n = new Number();
    	 n. ssort();
    	  break;
      case 4:
    	  
    	  date();
    	  break;
     
      default:
    		  System.out.println("Invalid option");
      
    }
      sc.close();
      }
      
	}


