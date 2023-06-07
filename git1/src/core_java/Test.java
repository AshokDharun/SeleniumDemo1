package core_java;

import java.util.ArrayList;

public class Test 
{
public static void main(String[] args) 
{
	int a[]={274,439,21,38512,953,842,426,2,782};
	ArrayList<Integer> al= new ArrayList<Integer>();
	int len=a.length;
	int n=2;
	String num=Integer.toString(n);
	int count=0;
	int sum=0;
	for(int i = 0;i<len;i++)
	{
		al.add(a[i]);	
	}
	for (int j=0;j<len;j++)
	{
		if(al.get(j).toString().contains(num))
		{
			//System.out.println("Contains");
			count++;
			//System.out.println(al.get(j));
			sum=sum+al.get(j);
			
		}
	}
	System.out.println(sum + "/"+ count);
	
	//A = {274,439,21,38512,953,842,426,2,782}
	//n = 2

	//Output = (274+21+38512+842+426+2+782)/7
}
}
