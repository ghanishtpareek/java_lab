package r177219084.q4;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int min=0;
		Scanner s = new Scanner(System.in);
		int num[] = new int[10];
		String grades[] = new String[10];
		for(int i=0; i<10; i++)
		{
			num[i]=s.nextInt();	
			
			if(num[i]>=40 && num[i]<=50)
			{
				grades[i]="pass";
			}
			else if(num[i]>=51 && num[i]<75)
			{
				grades[i]="Merit";
			}
			else if(num[i]>75)
			{
				grades[i]="Distinction";
			}
			
		}
		for(int i=0; i<10; i++) //to set lower limit
		{
			for(int j=0; j<9-i; j++) // main part of logic
			{
				if(num[j]>num[j+1]) 
				{
					int temp;
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		System.out.println("num "+"grades");
		for(int i=0; i<10; i++)
		{
			
			System.out.println(num[i]+" "+grades[i]);
		
		}
		
		  s.close();
	}
	

}
