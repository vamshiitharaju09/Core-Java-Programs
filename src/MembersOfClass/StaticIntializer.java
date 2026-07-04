package MembersOfClass;
//In java all the static initializer will be automatically executed during class loading process [ Main Method ].
//When the class having multiple static initializer, all the initializer will be executed top to bottom.
public class StaticIntializer {
	static {
		System.out.println("Multi line static initializer -1");
	}
	static {
		System.out.println("Multi line static initializer-2");
	}
	public static void main(String[]args)
	{
		System.out.println("Main started");
		System.out.println("Main Ended");
	}
	static {
		System.out.println("Multi line initializer-3");
	}

}
