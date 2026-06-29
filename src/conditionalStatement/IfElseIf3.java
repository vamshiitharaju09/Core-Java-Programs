package conditionalStatement;
//Student marks 
import java.util.Scanner;
public class IfElseIf3 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student marks");
		int marks=sc.nextInt();
	   if(marks>=91 && marks<100)
	   {
		  System.out.println("Excellent") ;
		  
	   }
	   else if(marks>=61 && marks <=90)
	   {
		   System.out.println("Good");
	   }
	   else if(marks>=35 && marks <=60)
	   {
		   System.out.println("Average");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
	
	}

}
