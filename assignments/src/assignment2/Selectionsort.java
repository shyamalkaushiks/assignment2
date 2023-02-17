package assignment2;

public class Selectionsort {
	public void sort(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					 
					int temp=a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public void printarray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30,40,14,25};
Selectionsort s=new Selectionsort();
System.out.println("before sort");
s.printarray(a);
s.sort(a);
System.out.println("after sort");
s.printarray(a);

	}

}
