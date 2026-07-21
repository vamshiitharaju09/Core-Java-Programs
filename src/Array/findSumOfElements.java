package Array;
//write a java program to find sum of elements in given array.
public class findSumOfElements {
	public static void main(String[]args)
	{
		int[]arr= {10,20,30,40};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
