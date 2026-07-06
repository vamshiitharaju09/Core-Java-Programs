package Constructor;

public class PersonDriver {
	public static void main(String[]args)
	{
		Person p1=new Person("Vamshi",25,'f');
		Person p2= new Person ("Shiva",30,'m');
		Person p3=new Person("Mahesh",67,'v');
		p1.details();
		p2.details();
		p3.details();
	}

}
