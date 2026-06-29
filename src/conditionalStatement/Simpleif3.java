package conditionalStatement;
//Check given number is positive or not.
import java.util.Scanner;
public class Simpleif3 {
	public static void main(String[]args)
	{
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num + ": this number is positive bro");
		}
		if(num<0)
		{
			System.out.println(num + ": this number is negative bro");
		}
		
	
	}

}
