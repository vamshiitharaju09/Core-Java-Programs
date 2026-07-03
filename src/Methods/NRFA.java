package Methods;
//without return type with formal argument.
public class NRFA {
	public static void print(int a) //-->without return type with formal argument.
	{
		System.out.println("Print method start");
		System.out.println(a);
		System.out.println("Print Ended");
	}
	public static void main(String[]args)
	{
		System.out.println("Main Start");
		print(20);
		System.out.println("Main Ended");
	}

}
