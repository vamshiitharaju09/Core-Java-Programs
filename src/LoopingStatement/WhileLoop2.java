package LoopingStatement;
//Write a java program to count even numbers in given data.
public class WhileLoop2 {
	public static void main(String[]args)
	{
		int num=123456789;
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				count++;
			}
			num =num/10;
		}
		System.out.println(count);
	}

}
