import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int remainder;
		int sum=0;
		int number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
         number=sc.nextInt();
        
         number2=number;
         
         	while(number!=0)
         	{
         		remainder=number%10;
         		sum=sum+(remainder*remainder*remainder);
         		number=number/10;
         	}
         	
         	if(number2==sum)
         	{
         		System.out.println("It is an armstrong number");
         	}
         	else
         	{
         		System.out.println("It is not an armstrong number");
         	}
		sc.close();
	}

}
