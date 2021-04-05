package r177219084.q1;
import java.util.*;

public class Arithmetic implements Test {
	
	public void square() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter number to square");
	    Integer a, sq ;
	    a = sc.nextInt();
	    sq = a*a;
	    System.out.println("square is "+sq);
	    sc.close();
	}

	public static void main(String[] args) {
		Arithmetic obj1 = new Arithmetic();
		obj1.square();

	}

}
