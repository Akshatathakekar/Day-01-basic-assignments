import java.util.Scanner;

import javax.swing.border.CompoundBorder;

public class SimpleCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float principal;
		float rate;
		float years;
	
		double simpleInterest;
		double compoundInterest ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a principal");
        principal=sc.nextFloat();
		System.out.println("Enter a rate");
        rate=sc.nextFloat();
		System.out.println("Enter a number of years");
        years=sc.nextFloat();
	
     
        simpleInterest=(principal*rate*years)/100;
        
        System.out.println("simple Interest is "+simpleInterest);
        
        compoundInterest = principal*(Math.pow((1+rate/100),years));        
		
        System.out.println("compound Interest is "+compoundInterest);
	}

}
