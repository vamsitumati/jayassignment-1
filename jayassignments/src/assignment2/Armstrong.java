package assignment2;

import java.util.*;
 
public class Armstrong {
	
	int n;
	   
	
	void getVal() {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\nEnter the 'n' value : ");
		n = scan.nextInt();
 scan.close();
	}
 
	void armstrong() {
		
		
		System.out.println("0");
		System.out.println("1");
		 int count=0;
		 int temp1 =n;
		 while(temp1>0)
		 {
			 temp1= temp1/10;
			 count = count+1;
		 }
		 if(count<2)
		 {
			 System.out.println("0");
			 System.out.println("1");
			 System.exit(0);
		 }
		 for(int m=3;m<=count;m++){
		for(int i=0; i<=n; i++) {
			
			int temp = i;
			int sum = 0;
			int mod = 0;
			
			while(temp != 0) {
				
				mod = temp % 10;
				sum = sum +(int) Math.pow(mod,m);
				temp = temp / 10;
			}
			
			if(sum == i) {
				
				if(sum==0 ||sum==1)
				{
				}
				else
				{
					
				System.out.println(i);}
			}
		}
		 }
	}
	public static void main(String args[])
	{
		Armstrong a = new Armstrong();
		a.getVal();
		a.armstrong();
	}
}


