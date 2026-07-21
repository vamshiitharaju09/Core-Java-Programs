package ExceptionHandling.TryAndCatch;

public class Demo {
	public static void main(String[]args)
	{
		System.out.println("Start");
		try {
			System.out.println(10/0);
		//throw new Arthmatical  Exception(); ---> Internally.
		}
		
		//Exception e=new Arthmatical Exception();
		catch (Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("End");
	}

}
