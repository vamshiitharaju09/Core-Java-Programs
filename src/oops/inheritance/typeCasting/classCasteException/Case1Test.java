package oops.inheritance.typeCasting.classCasteException;

public class Case1Test extends Case1Demo {
	int b=10;
	public static void main(String[]args)
	{
		System.out.println("Start");
		Case1Test t1=(Case1Test)new Case1Demo();
		System.out.println("End");
		
	}

}
