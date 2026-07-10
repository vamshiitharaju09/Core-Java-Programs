package oops.inheritance;
//A super class having more than one sub class in the same level is known as "Hirarchical Inheritance".
public class HirarchicalDevice {
	String brand;
	double price;
	HirarchicalDevice(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void printDevice()
	{
		System.out.println("Device Brand : "+brand);
		System.out.println("Device Price : "+price);
	}

}
