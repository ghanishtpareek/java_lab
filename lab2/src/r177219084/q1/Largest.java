package r177219084.q1;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num_1,num_2,num_3;
		System.out.println("enter first number ");
		num_1 = s.nextInt();
		System.out.println("enter second number");
		num_2 = s.nextInt();
		System.out.println("enter the third number");
		num_3 = s.nextInt();
		
		if(num_1<num_2 && num_2>num_3)
		{
			System.out.println("largest number  "+num_2);
		}
		else if (num_1>num_2 && num_1>num_3)
		{
			System.out.println("largest number"+ num_1);
		}
		else
		{
			System.out.println("largest number"+num_3);
		}
		
		  s.close();
	}

}
