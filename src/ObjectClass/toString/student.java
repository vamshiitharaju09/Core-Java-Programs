package ObjectClass.toString;
//After override toString()
public class student {
	
	@Override
	 public String toString()
	 {
		 return "student@123";
	 }
	public static void main(String[]args)
	{
		student s1=new student();
		System.out.println(s1);
		student s2=new student();
		System.out.println(s2);
	}

}
