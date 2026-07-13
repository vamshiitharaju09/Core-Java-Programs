package oops.polymorphism;
import java.util.Scanner;
public class Triangle extends Rectangle {
	public void area()
	{
		System.out.println("Finding the area of triangle");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base");
		double b=sc.nextDouble();
		System.out.println("Enter Height");
		double h=sc.nextDouble();
		double res=0.5*b*h;
		System.out.println("Area of triangle : " +res);
	}

}
