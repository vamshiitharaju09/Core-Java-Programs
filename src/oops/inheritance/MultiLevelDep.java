package oops.inheritance;

public class MultiLevelDep extends MultiLevelCollege {
	String Dname;
	MultiLevelDep(String Uname,String Cname,String Dname)
	{
		super(Uname,Cname);
		this.Dname=Dname;
	}
   public void PrintDep()
   {
	   System.out.println("University Name : "+Uname);
	   System.out.println("College Name : "+Cname);
	   System.out.println("Department Name : "+Dname);
	  
   }
   public static void main(String[]args)
   {
	   MultiLevelUniversity m1=new MultiLevelUniversity("JNTUH");
	   m1.printUniversity();
	   System.out.println("-------------------");
	   MultiLevelCollege m2=new MultiLevelCollege("JNTUH","Vaagdevi Engineering College");
	   m2.printCollege();
	   System.out.println("-------------------");
	   MultiLevelDep m3=new MultiLevelDep("JNTUH","Vaagdevi Engineering College","Data Science");
	   m3.PrintDep();
	   
	   
   }
}
