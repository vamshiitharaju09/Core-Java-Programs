package conditionalStatement;
//The process of creating one if block inside another if block is known as Nested if.
//Write a java program to check given number is positive or negative if number is positive check it is even or odd.
import java.util.Scanner;
public class NestedIf {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num>=0)
		{
			if(num%2==0)
			{
				System.out.println("The given number is positive and also even number");
	
			}
			
			else 
			{
				System.out.println("The given number is positive and also odd number");
			}
		}
		else
		{
			System.out.println("The given number is Negative number");
		}
		}

}
