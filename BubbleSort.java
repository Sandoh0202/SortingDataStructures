import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),t,i,j;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=in.nextInt();
		System.out.println("Sorted -");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
			System.out.print(arr[n-1-i]+"\t");
		}
	}
}