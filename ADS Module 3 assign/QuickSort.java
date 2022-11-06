
class QuickSort
{
	static void quicksort(int a1[],int low, int high)
	{
		if(low<high)
		{
			int pi=partition(a1, low, high);
			quicksort(a1, low,pi-1);//Left side
			quicksort(a1, pi+1, high);//Right side

		}
	}

	static int partition(int a1[],int low, int high)
	{
			int pivot=a1[high];
			int i =(low -1);//
			
			for(int j=low;j<high;j++)
			{
				if(a1[j] < pivot)
				{
					i++;
					swap(a1,i,j);
				}
				
			}
			swap(a1,i+1,high);
			return (i+1);
			
	}


	static void swap(int a1[],int i, int j)
	{
		int temp = a1[i];
		a1[i]=a1[j];
		a1[j]=temp;
	}
		
		static void display(int a1[])
		{
			int n =a1.length;
			for(int i=0;i<n;i++)
			{
				System.out.print(a1[i]+" ");
			}
		}
		

	public static void main(String args[])
	{
			
			int a1[]={2,13,24,45,9,30};
			int n =a1.length;
			display(a1);
			System.out.println();
			quicksort(a1, 0, n-1);
			
			System.out.println("Quicksort sort");
			display(a1);
			
			
			
		}
	}
	
	
	/*
2 13 24 45 9 30
Quicksort sort
2 9 13 24 30 45
*/