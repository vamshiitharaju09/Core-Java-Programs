package conditionalStatement;
//Write a java program to check the given number is positive or negative or zero and take user input.
import java.util.Scanner;
public class IfElseIf1 {
	public static void main(String[]args)
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num + " : number is positive");
		}
		else if(num<0)
		{
			System.out.println(num + " : number is negative");
		}
		else
		{
			System.out.println(num + " : number is zero");
		}
			
	}

}
