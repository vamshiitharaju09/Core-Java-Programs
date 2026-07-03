package TypeCasting;
// The process of converting smaller data into larger data type is known as "Widening".
//During the conversation there is no data lose and no  risk.
//Hence in java widening can achieved by "Implicit".

public class widening {
 public static void main(String[]args)
 {
	 //byte--->short
	 byte a=50;
	 short b=a;
	 System.out.println(b);
	 
	 //int--->double
	 int c=75;
	 double d=c;
	 System.out.println(d);
	 
	 //long--->float
	 long m=9876543215l;
	 float n=m;
	 System.out.println(n);
	 
	 //float--->double 
	 float x=1.4f;
	 double y=x;
	 System.out.println(y);
	 
 }
}
