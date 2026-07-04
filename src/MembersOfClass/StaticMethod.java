package MembersOfClass;
//Any method which is declared with help of static keyword is known as "static method"
public class StaticMethod {
	public static void view()
	{
		System.out.println("RCB");
	}
	public static void print() {
		System.out.println("SRH");
	}
	public static void main(String[]args)
	{
		//Direct Access
		view();
		print();
		
		//class name and dot operator
		
		StaticMethod.view();
		StaticMethod.print();
	}
} 
