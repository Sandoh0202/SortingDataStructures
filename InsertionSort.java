//Classic sorting algorithm!
import java.util.Scanner;
class InsertionSort
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[]=new int[10];
		int i,j,m,t;
		System.out.println("Enter the elements- ");
		for(i=0;i<10;i++)
			arr[i]=in.nextInt();
		for(i=0;i<10;i++)
		{
			for(j=i;j<10;j++)
			{
				if(arr[j]<arr[i])
				{
					t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		}
		System.out.println("Sorted Array-");
		for(i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
}