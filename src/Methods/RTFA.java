package Methods;
//With return type formal argument.
public class RTFA {
	public static double add (double a,double b)
	{
		double res=a+b;
		return res;
	}
	public static void main(String[]args)
	{
		System.out.println("Main start");
		System.out.println(add(2.8,4.6));
		System.out.println("Main Ended");
	}

}
