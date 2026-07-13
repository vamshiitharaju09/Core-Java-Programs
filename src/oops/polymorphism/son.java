package oops.polymorphism;

public class son extends MethodOverRiding  {
	
		public void bike()
		{
			System.out.println("Son's Bike");
		}
	
public static void main(String[]args)

{
	MethodOverRiding m1=new MethodOverRiding();
	m1.bike();
	son s1=new son();
	s1.bike();
	MethodOverRiding m2=new son();
	m2.bike();
	
}
}
