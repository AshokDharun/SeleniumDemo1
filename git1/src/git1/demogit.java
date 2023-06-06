package git1;

public class demogit 
{
public static void main(String[] args) {
	System.out.println("this is demo");
	printnom(1,11);
}

private static void printnom(int i, int j) {
	if(i<j)
	{ 
		System.out.print(i+ " ");
		i=i+1;
		printnom(i, j);
	}
	
}
}
