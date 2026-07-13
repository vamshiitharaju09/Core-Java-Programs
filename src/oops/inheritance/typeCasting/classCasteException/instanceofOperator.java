package oops.inheritance.typeCasting.classCasteException;
//instanceof is a keyword and binary operator which is used to avoid Class Cast Exception.
//The return type of instanceof Operator is boolean.
//If the object having the properties of class , then it will return true otherwise false.
public class instanceofOperator {
	public static void main(String[]args)
	{
		Case2Father f=new Case2Father();
		Case2Son s=new Case2Son();
		Case2Daughter d=new Case2Daughter();
		System.out.println(f instanceof Case2Father);
		System.out.println(s instanceof Case2Son);
		System.out.println(d instanceof Case2Daughter);
		System.out.println(f instanceof Case2Son);
		System.out.println(f instanceof Case2Daughter);
		System.out.println(s instanceof Case2Father);
	}

}
