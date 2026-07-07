package oops.encapsulation;

public class studentDriver {
	public static void main(String[]args)
	{
		student s1=new student();
		s1.setName("Vamshi");
		s1.setAge(23);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println("----------");
		student s2=new student();
		s2.setName("Ramya");
		s2.setAge(-2);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
	}

}
