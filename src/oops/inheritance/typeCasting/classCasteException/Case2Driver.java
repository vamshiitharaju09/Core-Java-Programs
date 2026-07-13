package oops.inheritance.typeCasting.classCasteException;

public class Case2Driver {
	public static void main(String[]args)
	{
		System.out.println("Start");
		Case2Father f1=new Case2Son();
		Case2Daughter d1=(Case2Daughter)f1;
	}

}
