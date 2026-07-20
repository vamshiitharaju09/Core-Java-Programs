package ObjectClass.hashcode;

import java.util.Objects;

public class AfterOverrideHashcode {
	String name;
	int sid;
	AfterOverrideHashcode(String name,int sid)
	{
		this.name=name;
		this.sid=sid;
	}
	public boolean equals(Object o)
	{
		AfterOverrideHashcode h1=(AfterOverrideHashcode)o;
		return this.name==h1.name && this.sid==h1.sid;
	}
	public int hashcode()
	{
		return Objects.hash(name,sid);
	}
	public static void main(String[]args)
	{
		AfterOverrideHashcode h1=new AfterOverrideHashcode("Vamshi",101);
		AfterOverrideHashcode h2=new AfterOverrideHashcode("Vamshi",101);
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashcode());
		System.out.println(h2.hashcode());
		System.out.println(h1);
		System.out.println(h2);
	}
	

}
