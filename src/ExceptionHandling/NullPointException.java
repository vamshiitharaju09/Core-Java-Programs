package ExceptionHandling;

public class NullPointException {
	int a=10;
	public static void main(String[]args)
	{
		System.out.println("Start");
		NullPointException n1=null;
		System.out.println(n1.a);
		System.out.println("End");
	}

}
