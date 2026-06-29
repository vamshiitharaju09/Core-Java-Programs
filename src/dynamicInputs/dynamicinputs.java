package dynamicInputs;
// The process of taking different inputs during execution of java program is known as dynamic inputs.
//In java we can take dynamic inputs with help of Scanner class.
// Scanner is a predefine class which is present in java.util package.
import java.util.Scanner;   //---->import Statement
public class dynamicinputs {
	public static void main(String[]args)
	{
		System.out.println("Enter a number");
		Scanner ab=new Scanner(System.in); //----> Object Creation
		int a=ab.nextInt(); //----> Calling  Non Static Method
		System.out.println("The dynamic input is : " + a);
		
	}

}
