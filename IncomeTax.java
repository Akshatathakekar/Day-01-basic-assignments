import java.util.Scanner;

public class IncomeTax {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salary;
		float taxAmount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your CTC");
		salary=sc.nextFloat();
		System.out.println("Your Tax Amount is ");
		
		if(salary>=0 && salary <= 180000)
		{
			System.out.println("Nil");
		}
		else if(salary>=181001 && salary <= 300000)
		{
			taxAmount=(float) (salary*(0.10));
			System.out.println(taxAmount);
		}
		else if(salary>=300001 && salary <= 500000)
		{
			
			taxAmount=(float) (salary*(0.20));
			System.out.println(taxAmount);


		}
		else if(salary>=500001 && salary <=1000000)
		{
			taxAmount=(float) (salary*(0.30));
			System.out.println(taxAmount);

		}
		sc.close();
	}

}
