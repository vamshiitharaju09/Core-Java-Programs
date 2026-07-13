package oops.polymorphism.superKeyword;

public class Test extends Demo {
	int a=100; //Non-Static variable
	public void view()
	{
		int a=1000; //local variable
		System.out.println(a); 
		System.out.println(this.a); 
		System.out.println(super.a);
	}
	 public static void main(String[]args)
	 {
		 Test t1=new Test();
		 t1.view();
	 }

}
