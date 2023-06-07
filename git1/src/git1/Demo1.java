package git1;

public class Demo1 
{
public static void main(String[] args) 
{
	String a = "this is 123 test23";
	//using .replace all method
	String result =a.replaceAll("\\d","");
	System.out.println(result);
	//convert char[] check is character is Digit or not
	String temp = null;
	String dig=null;
 for(int i=0;a.length()>i;i++)
	{
		if(!Character.isDigit(a.charAt(i)))
		{
			temp=temp+a.charAt(i);
		}
		else
		{
			dig=dig+a.charAt(i);
		}
	}
 System.out.println("remove all digits"+temp);
 System.out.println("removed all ststing char: " + dig);
	
}
}
