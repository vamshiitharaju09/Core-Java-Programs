package oops.inheritance.typeCasting;

public class DowncastingSon extends DowncastingFather {
	int b=20;
	
	public static void main(String[]args)
	{
		DowncastingFather f1=new DowncastingSon();
		DowncastingSon s1=(DowncastingSon)f1;
		System.out.println(s1.a);
		System.out.println(s1.b);
	}

}
