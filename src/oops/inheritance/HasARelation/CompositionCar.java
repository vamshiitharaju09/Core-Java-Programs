package oops.inheritance.HasARelation;

public class CompositionCar {
	String brand;
	String color;
	CompositionEngine e;  //has-a Relationship.
	CompositionCar(String brand ,String color, String fuel_type)
	{
		this.brand=brand;
		this.color=color;
		e=new CompositionEngine(fuel_type);
	}
	
	public static void main(String[]args)
	{
		CompositionCar c1=new CompositionCar("BMW","Blue","Diesel");
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.e.fuel_type);
	}

}
