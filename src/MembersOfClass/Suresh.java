package MembersOfClass;
//Accessing the non static variable from Ramesh class
public class Suresh {
	public static void main(String[]args)
	{
		Ramesh  r1=new Ramesh();
		System.out.println(r1.name);
		System.out.println(r1.b);
	}

}
