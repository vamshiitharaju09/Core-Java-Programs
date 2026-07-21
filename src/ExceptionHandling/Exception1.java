package ExceptionHandling;
//Exception is a event or interption which leads to stop the execution  and remaining set of instructions are not get executed is known as "Exception".
//All the exception will occurred only during runtime.
import java.util.Scanner;
public class Exception1 {
	public static void main(String[]args)
	{
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=sc.nextInt();
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		System.out.println(a/b);
		System.out.println("End");
	}
	

}
