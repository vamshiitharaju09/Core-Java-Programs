package LoopingStatement;
//Write a java program to count the factor number to the given number.
import java.util.Scanner;
public class ForLoop7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
