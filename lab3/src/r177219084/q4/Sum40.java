package r177219084.q4;

public class Sum40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0;
		for(a=45;a<=250;a++)
		{
			if(a%5==0)
			{
	
				System.out.println(a);
				sum += a;
			}
		}
		
		System.out.print("sum of all elements "+sum);
	}

}
