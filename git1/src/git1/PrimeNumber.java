package git1;

import java.util.Scanner;

public class PrimeNumber 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter poisitive number");
int n= sc.nextInt();
prime(n);
}

private static void prime(int n) {
	int m=n/2;

		int temp = 0;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}
		if(temp>=2)
		{
			System.out.println(n+ " is not prime number");
		}
		else
		{
			System.out.println(n+ " is prime number");	
		}

	
	
}
}
