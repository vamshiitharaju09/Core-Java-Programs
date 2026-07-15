package ObjectClass.equals;
//It is a built-in method which is present in object class.
//This method is used to compare two objects.
//In java. always == operator is compare object address.
//By default equals() is also compare object address
public class equalsMethod {
	//Before overriding Equals Method.
	int empid;
	equalsMethod(int empid)
	{
		this.empid=empid;
	}
	public static void main(String[]args)
	{
		equalsMethod e1=new equalsMethod(101);
		equalsMethod e2=new equalsMethod(102);
		equalsMethod e3=new equalsMethod(101);
		System.out.println(e1.equals(e3));
		System.out.println(e1==e3);
		
	}

}
