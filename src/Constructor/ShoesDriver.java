package Constructor;
import java.util.Scanner;
public class ShoesDriver {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Shoe Brand");
		String brand=sc.nextLine();
		System.out.println("Enter Shoe Price");
		double price=sc.nextDouble();
		System.out.println("Enter Shoe Color");
		String color=sc.next();
		Shoes s1=new Shoes(brand,price,color);
		s1.print();
		
	}

}
