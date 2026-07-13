package oops.polymorphism;
import java.util.Scanner;
public class Rectangle extends shapes {
	public void area()
	{
		System.out.println("Finding the area of rectangle");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		double l=sc.nextDouble();
		System.out.println("Enter Breath");
		double b=sc.nextDouble();
		double res=l*b;
		System.out.println("The area of rectangle : "+res);
	}

}
