package Object;
//A variable which is used store the object address is known as "Object Reference Variable".
//In java always we should store the object address inside "Object reference variable.
public class ObjectRef {
	public static void main(String[]args)
	{
		ObjectRef or;
		
		 or=new ObjectRef();
		 
		 System.out.println(or);
		 
		 ObjectRef or1=new ObjectRef();
		 
		 System.out.println(or1);
		 
		 //NOTE:In java one object can have multiple object reference variable.
		 // But one reference variable will never pointing to multiple objects.
	}

}
