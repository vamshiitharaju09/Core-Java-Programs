package oops.inheritance;

public class MultipleInheritance {
	//A Sub class having more than one super class in the same level is known as "MULTIPLE INHERITANCE".
	//In java with help of class is not possible to achieve multiple inheritance because of "DIAMOND PROBLEM".
	
	 //Diamond Problem.
//--->During inheritance every sub class constructor will call super class constructor with help of super calling statement.
//--->But in the multiple inheritance sub class constructor is getting ambiguity to call the super class constructor, which leads to diamond problem.
//--->We can overcome diamond problem with help of "interface", Because interface dose not have constructor

}
