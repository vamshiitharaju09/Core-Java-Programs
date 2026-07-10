package oops.inheritance;
//A sub class having more than one super class in different level is known as "Multi-Level inheritance".
public class MultiLevelUniversity {
	String Uname;
	MultiLevelUniversity(String Uname)
	{
		this.Uname=Uname;
	}
	public void printUniversity()
	{
		System.out.println("University Name : "+Uname);
	}

}
