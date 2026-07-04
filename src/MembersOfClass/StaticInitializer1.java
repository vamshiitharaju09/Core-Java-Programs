package MembersOfClass;

public class StaticInitializer1 {
	static int a;
	static double b=25;
	 
	static {
		System.out.println("MLSI");
	}
	public static void view()
	{
		System.out.println("Static method");
	}
	public static void main(String[]args)
	{
		System.out.println("Main start");
		System.out.println(a);
		System.out.println(b);
		view();
		System.out.println("Main Ended");
	}

}
