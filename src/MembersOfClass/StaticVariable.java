package MembersOfClass;
//When the properties and behaviours of the object is cammon for all the objects ,then we should go for "static Members"
//In java we can create static members with help of static keyword.
//static is a keyword and modifier which is used to create static variables, static methods, and static intializer.
public class StaticVariable {
//-->Any variable which is declared inside the class by using static keyword is known as "static variable".
//-->In java all the static variables are the initializer with default values.
//--->In java static variables can also possible to access in different class.
	 static double a;
	 static boolean b;
	 static char c;
	 public static void main(String[]args)
	 {
		 System.out.println(a);
		 System.out.println(StaticVariable.b);
		 System.out.println(c);
	 }

}


