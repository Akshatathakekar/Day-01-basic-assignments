import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[15];
		int searchValue;
		Scanner scr=new Scanner(System.in);
		
		System.out.println("enter 15 values");
		for(int i=0;i<15;i++)
		{
			a[i]=scr.nextInt();
		}
		
		System.out.println("values are ");
		for(int i=0;i<15;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		System.out.println("Enter a value to be search");
		searchValue=scr.nextInt();
		
		for(int i=0;i<15;i++)
		{
			if(a[i]==searchValue)
			{
				System.out.println("Searched value is "+a[i]);
				break;
			}
		}
		
		
		scr.close();
	}

}
