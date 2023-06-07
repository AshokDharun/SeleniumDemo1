package core_java;

public class StringConverts2 
{
public static void main(String[] args) 
{
	StringConverts2 obj1=new StringConverts2();
	String s="dwdwd";
	int a= Integer.parseInt("433");
	double d = Double.parseDouble("4534.434");
	char c=s.charAt(0);
	char[] carray= s.toCharArray();
	for (char e : carray) {
		System.out.println(e);
		
	}
	System.out.println(c);
	obj1.stringConvert("242jh43");

}

public void stringConvert(String string)
{
	try
	{int a=Integer.parseInt(string);
	Integer in=Integer.valueOf(string);
	System.out.println(a+ " " + in);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("enter value shoulkd be in numbers only");
	}
	
}

}
