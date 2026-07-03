package TypeCasting;
//The process converting large data type into small data type is known as "Narrowing".
//While converting large data type into  smaller data type ,we have data loss and risk.
//Hence in java we can achieve  narrowing explicit by using  type casting operator.

public class narrowing {
  public static void main(String[]args)
  {
	  //double--->int
	  double a=25.85;
	  int b=(int)a;
	  System.out.println(b);
	  
	  //long--->int
	  long c=780l;
	  int d=(int)c;
	  System.out.println(d);
	  
	  //float--->long
	  float e=7.5f;
	  long f=(long)e;
	  System.out.println(f);
	   
	  
  }
}
