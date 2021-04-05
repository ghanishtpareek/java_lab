package r177219084.q4;

import java.util.Scanner;

public class DemoClass implements InterfaceA {
	
	Integer a,b;
	
	 public void division(Integer c , Integer d)
	 {
		 Integer div=0;
		 div = c/d;
		 System.out.println(" Division of numbers"+div);  
	 }
	 public void modules(Integer c , Integer d)
	 {
		 Integer  modulo = c%d;
		 System.out.println(" modulus"+modulo); 
	 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DemoClass obj1=new DemoClass ();
		System.out.print(" first number"); 
		obj1.a = sc.nextInt();
		System.out.print("second number "); 
		obj1.b = sc.nextInt();
		obj1.division(obj1.a,obj1.b);
		obj1.modules(obj1.a,obj1.b);
		sc.close();


	}

}
