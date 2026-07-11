package oops.inheritance.HasARelation;

public class CompositionAuthor {
	String authorName;
	int age;
	
	CompositionAuthor(String authorName, int age)
	{
		this.authorName=authorName;
		this.age=age;
		
	}
	public void displayAuthor()
	{
		System.out.println("Author Name : "+authorName);
		System.out.println("Author Age : "+age);
	}
	
	

}
