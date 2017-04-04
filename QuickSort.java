//Classic Sorting algoorithm!
import java.util.*;
class QuickSort
{
	static void sort(int a[],int l,int r)
	{
		int i=l,j=r,t,p=a[i+(j-i)/2];
		while(i<=j)
		{
			while(a[i]<p)
				i++;
			while(a[j]>p)
				j--;
			if(i<=j)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;j--;
			}
		}
		if(l<j)
			sort(a,l,j);
		if(i<r)
			sort(a,i,r);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[]=new int[10],i;
		for(i=0;i<10;i++)
			arr[i]=in.nextInt();
		sort(arr,0,9);
		System.out.println("Sorted Array -");
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
}