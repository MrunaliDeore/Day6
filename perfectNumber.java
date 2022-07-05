package Six;

import java.util.Scanner;

public class perfectNumber 
{
	public static void main(String args[])  
	{
		int num, rem, sum = 0, i;  

		//Take the no. from user
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner(System.in);
		num  =scan.nextInt();

		for(i = 1; i < num; i++)  
		{  
			rem = num % i;  
			if (rem == 0)  
			{  
				sum = sum + i;  
			}  
		}
		
		//check sum of no. that taken from user
		if (sum == num)  
			System.out.println(num  + " is a Perfect Number");
		else
			System.out.println(num  + " is not a Perfect Number");
	}
}
