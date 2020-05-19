package poly;

import java.util.Scanner;

public class fact {
public static void main(String[] args) {
	
	int k,fact=1,i;
	System.out.println("Enter the Number");
	Scanner a=new Scanner(System.in);
	k=a.nextInt(); 
	for(i=1;i<=k;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}


int k,fact=1;i;

