package oops.polymorphism;

public class whatsappUser {
	public static void main(String[]args)
	{
		whatsappv1 v1=new whatsappv1();
		v1.messageDelivery();
	System.out.println("-----------------------");	
		whatsappv2 v2=new whatsappv2();
		v2.messageDelivery();
		System.out.println("-----------------------");	
		whatsappv3 v3=new whatsappv3();
		v3.messageDelivery();
	}

}
