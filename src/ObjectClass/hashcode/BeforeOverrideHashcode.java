package ObjectClass.hashcode;
//hashcode() is used to returns "Integer Representation of object".
//In java every object is having unique integer representation.
public class BeforeOverrideHashcode {
	String name;
	int sid;
	BeforeOverrideHashcode(String name,int sid)
	{
		this.name=name;
		this.sid=sid;
	}
	public static void main(String[]args)
	{
		BeforeOverrideHashcode h1=new BeforeOverrideHashcode("Vamshi",101);
		BeforeOverrideHashcode h2=new BeforeOverrideHashcode("Vamsh",101);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
	}
	

}
