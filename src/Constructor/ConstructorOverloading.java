package Constructor;
//The process of creating multiple constructor inside the same class but changing formal arguments is known as "Constructor Overloading".
public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println("Constructor -1");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("Constructor -2");	
	}
	ConstructorOverloading(double b)
	{
		System.out.println("Constructor -3");
	}
	ConstructorOverloading(int a,double b)
	{
		System.out.println("Constructor -4");
	}
	ConstructorOverloading(double a,int b)
	{
		System.out.println("Constructor -5");
	}
	
	public static void main(String[]args)
	{
		ConstructorOverloading c1=new ConstructorOverloading();
		ConstructorOverloading c2=new ConstructorOverloading(20);
		ConstructorOverloading c3=new ConstructorOverloading(3.2);
		ConstructorOverloading c4=new ConstructorOverloading(40,3.5);
		ConstructorOverloading c5=new ConstructorOverloading(3.5,30);
	}

}
