package conditionalStatement;
//write a java program to check  the given character is alphabetic or not.
import  java.util.Scanner;
public class IfElse3 {
	public static void main(String[]args)

	{
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		char cha=sc.next().charAt(0);
		if((cha>=65 && cha<=90) || (cha>=97&&cha<=122))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not Alphabet");
		}
		
	}
}
