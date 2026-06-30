package conditionalStatement;
//write a java program to check given number is even or odd by using switch statement.
import java.util.Scanner;
public class Switch1 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
	   
		int rem=num%2;
		switch(rem)
		{
		case 0:{
			System.out.println(num + " : this number is even");
		} 
		break;
		default :{
			System.out.println(num  +" : this number is odd");
		}
		}
	
	}

}
