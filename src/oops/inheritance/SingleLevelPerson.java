package oops.inheritance;
//A sub class having only one super class in the same  level is known as "Single level inheritance"
public class SingleLevelPerson {
	String name;
	int age;
	SingleLevelPerson(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
  public void printPersonDetails ()
  {
	  System.out.println("Name : "+ name);
	  System.out.println("Age : "+age);
  }
}
