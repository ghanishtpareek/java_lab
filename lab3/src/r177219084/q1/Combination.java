package r177219084.q1;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i<3; i++)
		{
			a = s.nextInt();
			arr[i] = a;
		}
		 for (int x = 0; x < 3; x++) {
			   for (int y = 0; y < 3; y++) {
			    for (int z = 0; z < 3; z++) {
			     if (x != y && y != z && z != x) {
			      System.out.println(arr[x] + "" + arr[y] + "" + arr[z]);
			     }
			    }
			   }
	}
	}
}
