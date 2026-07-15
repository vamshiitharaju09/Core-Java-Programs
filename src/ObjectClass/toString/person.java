package ObjectClass.toString;

public class person {
	String name;
	person(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "Name : "+name;
	}
	public static void main(String[]args)
	{
		person p1=new person("vamshi");
		System.out.println(p1);
		person p2=new person("Rakshitha");
		System.out.println(p2);
	}

}
