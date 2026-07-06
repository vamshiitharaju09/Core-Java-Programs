package Constructor;

public class Employee {
	String name;
	int empid;
	double sal;
	Employee(String name)
	{
		this.name=name;
	}
	Employee(String name,int empid)
	{
		this.name=name;
		this.empid=empid;
	}
	Employee(String name,int empid,double sal)
	{
		this.name=name;
		this.empid=empid;
		this.sal=sal;
	}
  public void print()
  {
	  if(name !=null)
	  {
		  System.out.println("Name : " +name);
	  }
	  if(empid !=0)
	  {
		  System.out.println("Empid : " + empid);
	  }
	  if(sal !=0)
	  {
		  System.out.println("Salary : " + sal);
	  }
  }
}
