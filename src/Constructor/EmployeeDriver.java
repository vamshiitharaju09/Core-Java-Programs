package Constructor;

public class EmployeeDriver {
	public static void main(String[]args)
	{
		Employee e1=new Employee("Vamshi");
		Employee e2=new Employee("Vamshi",101);
		Employee e3=new Employee("Vamshi",102,22000.0);
		e1.print();
		System.out.println("-----------------------");
		e2.print();
		System.out.println("------------------------");
		e3.print();
		System.out.println("------------------------");
	}

}
