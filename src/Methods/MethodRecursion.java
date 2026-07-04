package Methods;
//A method which is calling it self continuesly is known as "Method Recursion".
public class MethodRecursion {
	public static void m1()
	{
		System.out.println("I love you");
		m1();
		
	}
	 public static void main(String[]args)
	 {
		 System.out.println("Main start");
		 m1();
		 System.out.println("Main Ended");
	 }

}
