package Constructor;
//The process of one constructor calling another constructor is known as "Constructor Chaining".
//In java we can achieve constructor chaining in two ways.
//i)this calling statement.
//ii)super calling statement.

// i) this calling statement.
// this calling statement is used to call another constructor which is present in same class.
public class ConstructorChaining {
	ConstructorChaining()
	{
		System.out.println("SRH");
	}
	ConstructorChaining(int a)
	{
		this();
		System.out.println("RCB");
	}
	ConstructorChaining(double b)
	{
		this(2);
		System.out.println("PBK");
	}
	public static void main(String[]args)
	{
		ConstructorChaining c1=new ConstructorChaining();
		System.out.println("----------------------");
		ConstructorChaining c2=new ConstructorChaining(10);
		System.out.println("----------------------");
		ConstructorChaining c3=new ConstructorChaining(2.4);
	}
	

}
