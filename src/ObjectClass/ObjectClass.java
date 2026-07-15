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
//Methods present inside object class
//  i).public String toString(){}
//  ii).public boolean equals(object obj){}
// iii).public int hashcode(){}
// iv).public final void notify(){}
// v).public void notifyAll(){}
// vi).public final void wait(){}
// vii).public final void wait(long a){}
// viii).public final wait(long a,int b){}
// ix).public class <E> getclass(){}
// x).protected object clone(){}
// xi)protected void finalize(){}
	

}
