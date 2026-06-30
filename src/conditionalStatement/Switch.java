package conditionalStatement;
//When we have some conditions with different implementations, then we go for "switch statement".
// --->In switch value we can use only byte,short,int,char,and string data.
//---> The data type of swtch value and case value must be same.
//---> All the case value must be "unique".
import java.util.Scanner;
public class Switch {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("choose a number");
		int num=sc.nextInt();
		switch(num)
		{
		case 1 :{
			System.out.println("one");
		}
		break;
		
		case 2 :{
			System.out.println("Two");
		}
		break;
		case 3:{
			System.out.println("Three");
		}
		break;
		default :{
			System.out.println("Enter the valid number");
		}
		}
		
	
	}

}
