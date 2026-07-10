package oops.inheritance;

public class HirarchicalMobile extends HirarchicalDevice{
	int pixel;
	HirarchicalMobile(String brand, double price,int pixel)
	{
		super(brand,price);
		this.pixel=pixel;
		
	}
	public void printMobile()
	{
		System.out.println("Device Brand : "+brand);
		System.out.println("Device Price : "+price);
		System.out.println("Device Pixel: "+pixel);
		
	}

}
