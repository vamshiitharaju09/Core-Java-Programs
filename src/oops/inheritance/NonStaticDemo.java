package oops.inheritance;
//Acquring the static members from StaticDemo class.
public class NonStaticDemo extends StaticDemo {
	public static void main(String[]args)
	{
		System.out.println(NonStaticDemo.a);
		NonStaticDemo.view();
	}

}
