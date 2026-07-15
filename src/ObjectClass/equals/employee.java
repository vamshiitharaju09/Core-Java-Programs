package ObjectClass.equals;
//Steps to override equals()
//i)UpCasting
//ii)DownCasting
//iii)Comparsion Logic
//After override equals Method
public class employee {
	int empid;
	employee(int empid)
	{
		this.empid=empid;
	}
	public boolean equals(Object o) //UpCasting
	{
		employee e=(employee)o;  //DownCasting
		return this.empid==e.empid;  //Logic
		
	}
	
	public static void main(String[]args)
	{
		employee e1=new employee(101);
		employee e2=new employee(102);
		employee e3=new employee(101);
		System.out.println(e1==e3);
		System.out.println(e1.equals(e3));
	}

}
