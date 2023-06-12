package git1;



import java.util.ArrayList;
import java.util.List;

public class MissingValue
{
public static void main(String[] args) 
{
	int []a={1,2,3,5,7,9};
	int len=a.length;
	int c=a[len-1];
	
	ArrayList<Integer>list=new ArrayList<>();
	//System.out.println(c);
	for(int i=1;i<=c;i++)
	{
	list.add(i);
	}
	
	int b[]=new int [list.size()];
	System.out.println("second array length"+b.length);
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<b.length;j++){
			
			if(a[i]!=b[j]){
				System.out.println(j);
				
			}
		}
	}
}
}
