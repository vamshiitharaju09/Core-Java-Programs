package oops.encapsulation;

public class EmployeeDriver {
	public static void print(Employee e)
	{
		System.out.println("Employee Name is : " + e.name);
		System.out.println("His salary is : "+ e.sal);
	}
	public static void highestsal(Employee e1,Employee e2,Employee e3)
	{
		if(e1.sal>e2.sal&& e1.sal>e3.sal)
		{
			System.out.println("Highest salary : "+e1.sal);
		}
		else if(e2.sal>e1.sal&&e2.sal>e3.sal)
		{
			System.out.println("Highest salary : "+e2.sal);
		}
		else {
			System.out.println("Highest salary : "+e3.sal);
		}
	}
	public static void main (String[]args)
	{
		Employee e1=new Employee("Vamshi",27000.0);
		Employee e2=new Employee("Varsha",32000.0);
		Employee e3=new Employee("Krishna",17000.0);
		print(e1);
		System.out.println("---------------------");
		print(e2);
		System.out.println("---------------------");
		print(e3);
		System.out.println("---------------------");
		
		highestsal(e1,e2,e3);
		
	}

}
