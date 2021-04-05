package r177219084.q2;

public class MyClass implements InterfaceA {

	public void meth1()
	{
		System.out.println("this is method 1");
	}
	public void meth2() {
		System.out.println("this is method 2");
	}
	public static void main(String[] args) {
	
		MyClass obj1 = new MyClass();
		obj1.meth1();
		obj1.meth2();
	}
}
