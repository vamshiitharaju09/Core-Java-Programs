package oops.inheritance;

public class MultiLevelCollege extends MultiLevelUniversity {
	String Cname;
	MultiLevelCollege(String Uname,String Cname)
	{
		super(Uname);
		this.Cname=Cname;
	}
	public void printCollege()
	{
		System.out.println("University Name : "+Uname);
		System.out.println("College Name : "+Cname);
		
	}

}
