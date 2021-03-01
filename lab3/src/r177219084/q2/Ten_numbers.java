package r177219084.q2;

import java.util.Scanner;

public class Ten_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, sum=0;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i<10; i++)
		{
			a = s.nextInt();
			arr[i] = a*a;
			sum += arr[i];
		}
		
		System.out.println("all elements");
		
		for(int i =0; i<10; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" \n sum of all elements "+sum);

	}
}
