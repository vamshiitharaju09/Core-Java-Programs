package Array;
//write a java program to print negative numbers in given array.
public class printNegativeNumber {
	public static void main(String[]args)
	{
		int[]arr=new int[4];
		arr[0]=-1;
		arr[1]=-2;
		arr[2]=1;
		arr[3]=2;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
