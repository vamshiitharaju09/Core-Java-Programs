package oops.abstraction;

public class calImple extends calculator {
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	public void sub(double a, double b)
	{
		System.out.println(a-b);
	}
	public void mul(double a, double b)
	{
		System.out.println(a*b);
	}
	public void div(double a, double b)
	{
		System.out.println(a/b);
	}
	public static void main(String[]args)
	{
		calImple c1=new calImple();
		c1.add(2.4,4.3);
		c1.sub(2.4, 3.5);
		c1.mul(5.4,4.5);
		c1.div(3.4,7.5);
	}

}
