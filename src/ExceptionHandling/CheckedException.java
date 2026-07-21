package ExceptionHandling;
//A Checked Exception is an exception that is checked by the compiler during compilation and must be either handled or declared.

import java.io.FileReader;
import java.lang.Throwable;
public class CheckedException {
	public static void main(String[]args)
	{
		System.out.println("Start");
		try {
			FileReader fr=new FileReader("c:\\Demo\\Text.txt"); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
