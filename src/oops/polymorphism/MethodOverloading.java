package oops.polymorphism;
//The process of creating multiple methods with same name but changing formal arguments is known as "Method Overloading".
public class MethodOverloading {
	private static void view()
	{
		System.out.println("Method-1");
	}
	public void view(int a)
	{
		System.out.println("Method-2");
	}
	public static int view(double b)
	{
		System.out.println("Method-3");
		return 10;
		
	}
	public final static void view(int a,double b)
	{
		System.out.println("Method-4");
	}
	public static void view (double a,int b)
	{
		System.out.println("Method-5");
	}
	public static void main(String[]args)
	{
		MethodOverloading m1=new MethodOverloading();
		 view();
		 m1.view(10);
		 m1.view(2.0);
		 m1.view(3,5.6);
		 m1.view(5.6,4);
		
	}

}
