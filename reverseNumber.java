package Six;

import java.util.Scanner;

public class reverseNumber 
{
	public static void main(String[] args)   
	{  
		int number, reverse = 0;  

		//Take the no. from user
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner(System.in);	
		number  =scan.nextInt();

		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}
