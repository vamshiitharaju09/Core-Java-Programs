package Array;
//Write a java program to find the maximum number in a given array.
public class findMaximumNumber {
	public  static void main(String[]args)
	{
		int []arr= {10,20,30,40};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number is : "+max);
	}

}
