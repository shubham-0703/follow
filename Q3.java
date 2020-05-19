package poly;

import java.util.Scanner;

class A{
	void check()
	{
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int flag=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			flag=1;
			break;
		}
		if(a==1)
		{
		System.out.println("1 is Nor Prime Neither Composite");	
		}
		else
		{
			if(flag==1)
				System.out.println("Number Is Not Prime");
			else
				System.out.println("Number Is Prime");		
		}
	}
}

public class prime {

	public static void main(String[] args) {
		
		A s=new A();
		s.check();
	}

}
