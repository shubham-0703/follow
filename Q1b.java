package question;

import java.util.Scanner;

public class Rec 
{
		 static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
	public static void main(String [] args)
	{
		System.out.println("Enter nth term: ");
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		System.out.println(fib(n));
	}

}
