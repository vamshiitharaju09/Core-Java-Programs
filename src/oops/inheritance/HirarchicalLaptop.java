package oops.inheritance;

public class HirarchicalLaptop extends HirarchicalDevice {
	int ssd;
	HirarchicalLaptop(String brand,double price,int ssd)
	{
		super(brand,price);
		this.ssd=ssd;
	}
	public void printLaptop()
	{
		System.out.println("Device Brand : "+brand);
		System.out.println("Device Price : "+price);
		System.out.println("Device SSD : "+ssd);
	}

}
