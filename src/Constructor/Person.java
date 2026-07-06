package Constructor;

public class Person {
	String name;
	int age;
	char gender;
	Person ( String n, int a, char g)
	{
		name=n;
		age=a;
		gender=g;
	}
	public void details()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : " + age);
		System.out.println("Gender : "+ gender);
	}

}
