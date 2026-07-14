package oops.abstraction;
//Creating and acceessing static members from abstract class
abstract class Demo {
	static int a=200;
	public static void view()
	{
		System.out.println("Demo classes");
	}
	
	public static void main(String[]args)
	{
		System.out.println(Demo.a);
		view();
	}

}
