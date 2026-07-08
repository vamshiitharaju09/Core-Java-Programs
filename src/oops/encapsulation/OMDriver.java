package oops.encapsulation;

public class OMDriver {
	
	public static void print(ObjectInToTheMethod o)
	{
		System.out.println("Name : " +o.name);
		System.out.println("Age : " +o.age);
		System.out.println("----------------");
	}
	public static void compare(ObjectInToTheMethod o1,ObjectInToTheMethod o2)
	{
		if(o1.age==o2.age)
		{
			System.out.println("Same Age");
		}
		else {
			System.out.println("Different Age");
		}
	}
	public static void main(String[]args)
	{
		ObjectInToTheMethod o1=new ObjectInToTheMethod("vamshi",23);
		ObjectInToTheMethod o2=new ObjectInToTheMethod("krishna",24);
		ObjectInToTheMethod o3=new ObjectInToTheMethod("jayanth",23);
		print(o1);
		print(o2);
		print(o3);
		compare(o1,o2);
		compare(o1,o3);
		
		
	}

}
