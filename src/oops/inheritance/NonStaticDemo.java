package oops.inheritance;
//The role of non static members during inheritance.
//In java Non static variables, non static methods, and non static single line initializers are inherited.
//Because we can access the super class non static members with help of sub class object.

public class NonStaticDemo {
	int a=10;
	public void print()
	{
		System.out.println("NonStaticDemo");
	}

}
