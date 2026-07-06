package Constructor;
//this is a keyword in java, which is always holds current object address.
//When local variable and non static variable is having same name , to  represent non static variable we should use "this" keyword.
//this keyword we can use only non static context.
public class ThisKeyword {
	int a=10;
	public void view()
	{
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[]args)
	{
		ThisKeyword t1=new ThisKeyword();
		t1.view();
	}

}
