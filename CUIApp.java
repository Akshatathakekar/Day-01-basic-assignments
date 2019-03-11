import java.util.Scanner;

public class CUIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username;
		String password;
		int n=0;
		Scanner sc=new Scanner(System.in);

       while(n<4)
       {

   			System.out.println("Enter username and password");
   			username=sc.next();
   			password=sc.next();
   			if(username.equals("akshata") && password.equals("123"))
   			{
   				System.out.println("Welcome akshata");
   				break;
   			} 

   			++n;
   		
   			if(n==3)
   			{
   				System.out.println("contact admin");
   			   System.exit(0);
   		
   	       }
       }
       
    
      sc.close();
	}

}
