import java.util.*;
class SelectionSort
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),t,i,j,max;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=in.nextInt();
		System.out.println("Sorted -");
		for(i=0;i<n;i++)
		{
			max=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[max])
					max=j;
			}
			t=arr[max];
			arr[max]=arr[i];
			arr[i]=t;
			System.out.print(arr[i]+"\t");
		}
	}
}