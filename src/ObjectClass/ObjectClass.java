package ObjectClass;
//Object class is a predefine class which is present in java.lang package.
//Object class is "super most class" in java, because for every class  Object class is super class .
//In java, inside object type of reference variable we can store all the object address in java.
import Methods.Demo;
public class ObjectClass {
	public static void main(String[]args)
	{
		Object o1=new ObjectClass();
		Object o2=new  Demo();
		System.out.println(o1);
		System.out.println(o2);
	}
	

}
