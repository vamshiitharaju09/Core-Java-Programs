package conditionalStatement;
//write a java program to check the person is eligible for voting or not.
import java.util.Scanner;
public class IfElse2 {
 public static void main(String[]args)
 {
	 System.out.println("Enter your age ");
	 Scanner sc=new Scanner(System.in);
	 int age = sc.nextInt();
     if(age>18)
     {
    	 System.out.println("Your age is eligible for voting");
     }
     else
     {
    	 System.out.println("Your not eligible for voting. you need "+ (18-age)+ "more years for voting");
     }
 }  
 
}
