package LoopingStatement;
//write  a java program to find the sum of natural numbers to given number
import java.util.Scanner;
public class ForLoop4 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	
	}

}
