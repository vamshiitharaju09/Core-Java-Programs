package ObjectClass;

public class productDriver {
	public static void main(String[]args)
	{
		product p1= new product("puma",101,2500.0,5.0);
		product p2= new product("puma",101,2500.0,5.0);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashcode());
		System.out.println(p2.hashcode());
		System.out.println(p1);
		System.out.println(p2);
		
		
				}

}
