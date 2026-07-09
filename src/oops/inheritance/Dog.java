package oops.inheritance;

public class Dog extends Animal{
	public void bark()
	{
		System.out.println("Animal  is barking");
	}
	public static void main(String[]args)
	{
		Dog d1=new Dog();
		
		d1.eat(); //eat method inherited from animal class to dog class.
		
		d1.bark();//bark method is own method of dog.
		
	}

}
