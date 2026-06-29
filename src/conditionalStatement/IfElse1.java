package conditionalStatement;
//write a java program to check the given number is divisible by both 5 and 10 or not.
import java.util.Scanner;
public class IfElse1 {
	public static void main(String[]args)
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0 && num%10==0)
		{
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divivsible");
		}
	}

}
