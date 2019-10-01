import java.io.*;
class BinarySearch
{
	static void bubbleSort(int data[])
	{
		for(int i=0;i<=data.length-1;i++)
		{
			for(int j=0;j<=data.length-2-i;j++)
			{
				if(data[j]>data[j+1])
				{
					int temp;
					temp=data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}
			}	
		}
	}
	
	static int binarySearch(int data[],int key)
	{
		int left=0,right=data.length-1,mid;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(key==data[mid])
				return mid;
			else if(key<data[mid])
				right=mid-1;
			else if(key>data[mid])
				left=mid+1;
		}
		return -1;
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n,i=0;
		int data[]=new int[5];
				
		while(i<5)
		{
			System.out.print("Please input data["+i+"]:");
			s=br.readLine();
			n=Integer.parseInt(s);
			data[i]=n;
			i++;
		}
		
		bubbleSort(data);
		System.out.println("The ordinal array is:");
		for(int j=0;j<data.length;j++)
		{
			System.out.print(data[j]+" ");
		}
		System.out.println();