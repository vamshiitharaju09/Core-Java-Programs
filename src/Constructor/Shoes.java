package Constructor;

public class Shoes {
	String brand;
	double price;
	String color;
	Shoes(String brand)
	{
		this.brand=brand;
	}
	Shoes(String brand,double price)
	{
		this(brand);
		this.price=price;
	}
	Shoes(String brand,double price,String color)
	{
		this(brand,price);
		this.color=color;
	}
	public void print() {
		System.out.println("Brand : "+ brand);
		System.out.println("Price : " + price);
		System.out.println("Color : " + color);
	}

}
