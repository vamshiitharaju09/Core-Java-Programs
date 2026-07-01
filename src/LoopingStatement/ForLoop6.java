package LoopingStatement;
//Write a java program to find the factor number to the give number.
import java.util.Scanner;
public class ForLoop6 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
