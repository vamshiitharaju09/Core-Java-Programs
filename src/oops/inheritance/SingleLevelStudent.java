package oops.inheritance;

public class SingleLevelStudent extends SingleLevelPerson {
	int sid;
	SingleLevelStudent(String name,int age,int sid)
	{
		super(name,age);
		this.sid=sid;
	}
	public void printStudentDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Sid : "+sid);
	}
	public static void main(String[]args)
	{
		SingleLevelPerson p1=new SingleLevelPerson("vamshi",21);
		p1.printPersonDetails();
	   SingleLevelStudent s1=new SingleLevelStudent("vamshi",23,101);
	   s1.printStudentDetails();

}
}
