import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int remainder;
		int sum;
	
	
       
      for(int i=100;i<=999;i++)
      {
    	    sum=0;
    	  
            number=i;
        	while(number!=0)
        	{
        		remainder=number%10;
        		sum=sum+(remainder*remainder*remainder);
        		number=number/10;
        	}
        
        	if(i==sum)
        	{
        		System.out.println(i +" is an armstrong number");
        	}
        	
 		
	}
}
}


