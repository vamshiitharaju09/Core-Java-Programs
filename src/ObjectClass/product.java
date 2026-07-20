package ObjectClass;

import java.util.Objects;

//Write a java program to create a product class and override toString(), equals(), and hashcode().
public class product {
	String name;
	int pid;
	double price;
	double rating;
	product(String name,int pid,double price,double rating)
	{
		this.name=name;
		this.pid=pid;
		this.price=price;
		this.rating=rating;
	}
	public String toString()
	{
		return "Name : " +name+",Pid : "+pid+",Price :"+price+",Rating : "+rating;
	}
	public boolean equals(Object o)
	{
		product p=(product)o;
		return this.name==p.name && this.pid==p.pid && this.price==p.price && this.rating==p.rating;
	}
	public int hashcode()
	{
		return Objects.hash(name,pid,price,rating);
		
	}

}
