package r177219084.q3;

import java.util.Scanner;

public class Democlass
{
	
	public static void main(String [] args) 
	{
		Scanner s = new Scanner(System.in);
		int a ;
		System.out.println("enter the value of a");
		a = s.nextInt();
	    Second obj1 = new Second();
	    a=obj1.square(a); //using object of another class to call its function
	    System.out.println("new valu of a "+a);
	    s.close();
	}
	
}
