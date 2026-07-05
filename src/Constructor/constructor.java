package Constructor;
//Constructor is a special non static member, which is used to load all non static members from class to object.
//In java constructor will be executed only when we call the constructor.
//We can call the constructor during object creation.
public class constructor {
	constructor()
	{
		System.out.println("constructor start");
		System.out.println("constructor ended");
	}
  public static void main(String[]args)
  {
	  System.out.println("Main start");
	  constructor c1=new constructor();
	       new constructor();
	       System.out.println("Main Ended");
	       
  }
}
