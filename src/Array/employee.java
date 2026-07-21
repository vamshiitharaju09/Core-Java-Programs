package Array;
//Write a java program to craete employee class and declare three properties then create five employee object and store inside employee array,then print only employee name whose salary is greaterthan or equal 20k and lessthan or equal 30.

public class employee {
	String name;
	int id;
	double sal;
	employee(String name,int id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		
	}
	public String toString()
	{
		return "Name : "+name+"\n ID : "+id+"\n Salary : "+sal+"\n";
	}
	public static void main(String[]args)
	{
		employee e1=new employee("Vamshi",101,20000.0);
		employee e2=new employee("Swathi",102,29000.0);
		employee e3=new employee("Siva",103,30000.0);
		employee e4=new employee("Mahesh",104,25000.0);
		employee e5=new employee("Sai",105,35000.0);
		employee[]e= {e1,e2,e3,e4,e5};
		for(int i=0;i<e.length;i++)
		{
			if(e[i].sal>=20000 && e[i].sal<=30000)
			{
				System.out.println(e[i]);
			}
		}
		
	}

}
