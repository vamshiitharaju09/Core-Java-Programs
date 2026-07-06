package Constructor;

public class Mobile {
    String brand;
    double price;
    String color;
    int ram;
    Mobile(String brand,double price,String color,int ram)
    {
    	this .brand=brand;
    	this.price=price;
    	this.color=color;
    	this.ram=ram;
    }
    public void m1()
{
    System.out.println("Brand : " + brand);
    System.out.println("Price : "+ price);
    System.out.println("Color : "+ color);
    System.out.println("Ram : " + ram);

}
}
