package core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringConverts

{
	public static void main(String[] args) {
		
	
String str="abcdi efigh injd cie";
// string convert to Array
//using split() for each & evry ele
String []words=str.split("");
for(int i=0;i<words.length;i++)
{
	System.out.println(words[i]);
}
System.out.println(str);
System.out.println(Arrays.toString(words));
System.out.println(words.length);
//using String [] approach string to array
String a[]=new String[]{str};
System.out.println(a);
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
//using specific seperation
String ar[]=null;
String patrn="i";
Pattern ptrn=Pattern.compile(patrn);
ar=ptrn.split(str);
//System.out.println(ar.toString());
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
//Use toArray method
List <String> lstr= new ArrayList<String>();
lstr.add("hi");
lstr.add("hello");
lstr.add("welcome");
lstr.add("thanks");
int lsize=lstr.size();
String[] ry=new String[lsize];
lstr.toArray(ry);
for(int i=0;i<ry.length;i++)
{
	System.out.println(ry[i]);
}

List <Integer> ls=new ArrayList<Integer>();
ls.add(56);
ls.add(6);
ls.add(62);	
ls.add(5);
ls.add(46);
int size=ls.size();
//ls.add(3, 3);

System.out.println("List values" + ls);
Integer[] inta= new Integer[size];
ls.toArray(inta);
for(int i=0;i<inta.length;i++)
{
	System.out.println(inta[i]);
}

stringConvert("00988");
	}
	
	public static void stringConvert(String string)
	{
		int a=Integer.parseInt(string);
		Integer in=Integer.valueOf(string);
	}

}
