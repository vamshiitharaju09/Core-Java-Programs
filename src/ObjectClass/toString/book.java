package ObjectClass.toString;

public class book {
	String name;
	int bid;
	double price;
	book(String name,int bid,double price)
	{
		this.name=name;
		this.bid=bid;
		this.price=price;
	}
	public String toString()
	{
		return "Name : "+name+"\nBid : "+bid+"\nPrice : "+price+"\n";
	}
	public static void main(String[]args)
	{
		book b1=new book("The Bird",101,250.0);
		System.out.println(b1);
		System.out.println("-------------------------");
		book b2=new book("The animal",102,399.0);
		System.out.println(b2);
		
	}

}
