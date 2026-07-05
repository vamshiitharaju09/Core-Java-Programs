package MembersOfClass;
//When the properties and behaviours is different from all the objects then we should go for "Non-static members".
//In java we access the non static members by creating the object.
//Then we can access with help of "Object reference variable and dot operator.
public class NonStatic {
	int a;
	double b;
	public static void main(String[]args)
	{
		NonStatic n=new NonStatic();
		System.out.println(n.a);
		System.out.println(n.b);
		
	}

}
