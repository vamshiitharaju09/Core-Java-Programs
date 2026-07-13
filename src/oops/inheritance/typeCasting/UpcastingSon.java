package oops.inheritance.typeCasting;

public class UpcastingSon extends UpcastingFather {
	int b=20;
	public static void main(String[]args)
	{
		UpcastingFather f1=new UpcastingSon();
		System.out.println(f1.a);
		//System.out.println(f1.b); //compilation problem here
//Note:-With help of upcasting reference variable we can access only super class members and not possible to access sub class members.
		
	}

}
