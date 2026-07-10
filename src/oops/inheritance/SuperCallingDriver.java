package oops.inheritance;

public class SuperCallingDriver extends SuperCalling {
	SuperCallingDriver()
	{
		//Here Implicity super calling statement is there.
		System.out.println("RCB");
	}
	public static void main(String[]args)
	{
		SuperCallingDriver s=new SuperCallingDriver();
	
	}

}
