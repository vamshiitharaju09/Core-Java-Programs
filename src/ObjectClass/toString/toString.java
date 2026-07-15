package ObjectClass.toString;
//toString is a built-in method which is present in Object class.
//By default toString() method is returns "StringRepresentationofObject" in the form of Fully Qualified className@Hexa decimal value of hash code.
//In java when we are printing any object reference variable, then automatically toString() method is get call.
public class toString {
	//Before overriding toString()
	public static void main(String[]args)
	{
		toString t1=new toString();
		System.out.println(t1);
		toString t2=new toString();
		System.out.println(t2);
	}

}


//Output is  Fully Qualified className@Hexa decimal value of hash code.

//ObjectClass.toString.toString@79fc0f2f
//ObjectClass.toString.toString@50040f0c