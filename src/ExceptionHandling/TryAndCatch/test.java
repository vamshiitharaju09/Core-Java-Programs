package ExceptionHandling.TryAndCatch;

public class test {
	public static void main(String[]args)
	{
		System.out.println("Start");
		int []arr= {18,96,9};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Index");
		}
		System.out.println("End");
		
	}

}
