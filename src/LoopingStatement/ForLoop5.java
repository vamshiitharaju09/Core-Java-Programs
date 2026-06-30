package LoopingStatement;
//Write a java program  to find the sum of factorial number to given number.
public class ForLoop5 {
	public static void main(String[]args)
	{
		int num=5;
		int fac=1;
		for(int i=1;i<=num;i++)
		{
			fac=fac*i;
		}
		System.out.println(fac);
	}

}
