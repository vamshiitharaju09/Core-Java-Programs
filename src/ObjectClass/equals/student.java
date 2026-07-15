package ObjectClass.equals;
//Compare multiple values
public class student {
	String name;
	int age;
	student(String name,int age)
	{
		this.name=name;
		this.age=age;
	
	}
	public boolean equals(Object o)
	{
		student s=(student)o;
		return this.name==s.name && this.age==s.age;
		
	}
	public static void main(String[]args)
	{
		student s1=new student("vamshi",22);
		student s2=new student("shiva",22);
		student s3=new student("vamshi",22);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}

}
