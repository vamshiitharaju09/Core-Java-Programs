package Array;
//Write a java program to store person object into the arrays and print all details of the person
public class personObject {
	String name;
	int age;
	personObject(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Name : "+name+"\n Age : "+age+"\n";
		
	}
	public static void main(String[]args)
	{
		personObject p1=new personObject("Vamshi",21);
		personObject p2=new personObject("Shiva",31);
		personObject p3=new personObject("Ram",27);
		personObject[]p= {p1,p2,p3};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
	}

}
