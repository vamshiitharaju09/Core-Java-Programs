package oops.inheritance;

public class HirarchicalDriver {
	public static void main(String[]args)
	{
		HirarchicalDevice h1=new HirarchicalDevice("Apple",120000.0);
		h1.printDevice();
		System.out.println("--------------------------");
		HirarchicalLaptop h2=new HirarchicalLaptop("Apple",120000.0,128);
		h2.printLaptop();
		System.out.println("--------------------------");
		 HirarchicalMobile h3=new  HirarchicalMobile("Apple",85000,20);
		 h3.printMobile();
	}

}
