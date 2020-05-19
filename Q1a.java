package poly;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		System.out.println("Enter The Term");
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		
		
		int i,num1=0,num2=1,sum;
		for(i=1;i<=N;i++)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		System.out.println(num1);
	}
}
