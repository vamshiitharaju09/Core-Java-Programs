package Constructor;
//A constructor which is having formal  arguments is known as "Parameterized Constructor".
public class ParameterizedConstructor {
	ParameterizedConstructor( int a,double b)
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		System.out.println("MS");
		ParameterizedConstructor p=new ParameterizedConstructor(2,3.5);
		ParameterizedConstructor p1=new ParameterizedConstructor(100,100.5);
		System.out.println("ME");
		
		
	}
	

}
