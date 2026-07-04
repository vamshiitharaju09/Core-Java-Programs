package Methods;

public class Demo {
	public static void view()
	{
		System.out.println("View start");
		print();
		System.out.println("view ened");
	}
	public static void print()
	{
		System.out.println("print start");
		System.out.println("print ended");
	}
	public static void main(String[]args)
	{
		System.out.println("Main start");
		view();
		System.out.println("Main Ended");
	}

}
