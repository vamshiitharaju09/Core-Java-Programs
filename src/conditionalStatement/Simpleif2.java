package conditionalStatement;
//Write a java program to print KING, If given number is 18.
import java.util.Scanner;
public class Simpleif2 {
	public static void main(String[]args)
	{
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==18)
		{
			System.out.println("KING");
		}
	}

}
