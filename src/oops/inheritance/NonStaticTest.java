package oops.inheritance;
// Acquring the non static members from NonStaticDemo to NonStaticTest. 
public class NonStaticTest extends NonStaticDemo {
	public static void main(String[]args)
	{
		NonStaticTest t1=new NonStaticTest();
		System.out.println(t1.a);
		t1.print();
	}

}
