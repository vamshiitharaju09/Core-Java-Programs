package oops.inheritance;
//The role of constructor during inheritance.
//In java every sub class constructor will call super class constructor with help of "Super Calling Statement".
 //SUPER CALLING STATEMENT.
//Super calling statement is used to call super class constructor.
//In java compiler automatically added implicity super calling statement inside sub class constructor.
//If super class constructor is having parameterized constructor then programmer should be write explicity super calling statement by passing actual arguments.
//Super calling statement must be inside only first lone of constructor.
//Hence it is not possible to use both "this calling statement" and "super calling statements" in the same time.
public class SuperCalling {
	SuperCalling()
	{
		System.out.println("SRH");
	}

}
