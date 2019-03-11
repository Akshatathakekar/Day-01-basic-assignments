import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[15];
		int i;
		int j;
		int temp;
		Scanner scr=new Scanner(System.in);
		
		System.out.println("enter 15 values");
		for(i=0;i<15;i++)
		{
			a[i]=scr.nextInt();
		}
		
		System.out.println("values are ");
		for(i=0;i<15;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		for(i=0;i<=14;i++)
		{
			for(j=i+1;j<15;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println("Sorted values are");
		for(i=0;i<15;i++)
		{
			System.out.print(a[i]+"  ");
		}
	scr.close();
	
	}

}
