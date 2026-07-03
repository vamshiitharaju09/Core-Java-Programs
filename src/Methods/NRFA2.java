package Methods;
//without return type with formal argument.
public class NRFA2 {
	public static void add(int a,int b)
	{
		System.out.println("Add method start");
		System.out.println(a+b);
		System.out.println("Add method ended");
		
	}
	public static void main(String[]args)
	{
		System.out.println("Main start");
		add(30,30);
		add(10,110);
		System.out.println("Main Ended");
	}

}
