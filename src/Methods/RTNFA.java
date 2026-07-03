package Methods;
//with return type without formal argument
public class RTNFA {
	public static double sample()
	{
		System.out.println("sample method start");
		System.out.println("sample ended");
		 return 2.5;
	}
	public static void main(String[]args)
	{
		System.out.println("main start");
       System.out.println(sample());
		double m=sample();
		System.out.println(m);
		System.out.println("main Ended");
	
	}
	

}
