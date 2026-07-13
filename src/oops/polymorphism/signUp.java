package oops.polymorphism;

public class signUp {
	public static void signUp(String username,String password,String email)
	{
		System.out.println("UserName : "+username);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
	}
	public static void signUp(String username,String password,long number)
	{

		System.out.println("UserName : "+username);
		System.out.println("Password : "+password);
		System.out.println("Number : "+number);
	}
	public static void signUp(String username,String password,String email,long number)
	{
		System.out.println("UserName : "+username);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
		System.out.println("Number : "+number);
	
	}
	public static void main(String[]args)
	{
		signUp("Vamshi","Krishna","vamshi@gmail.com");
		System.out.println("-------------------------------");
		signUp("Vamshi","Krishna",91000000 );
		System.out.println("-------------------------------");
		signUp("Vamshi","Krishna","vamshi@gmail.com",900000000);
	}

}
