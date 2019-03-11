import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float subject1;
		float subject2;
		float subject3;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter marks of subject1");
		subject1=scr.nextFloat();
		System.out.println("enter marks of subject2");
		subject2=scr.nextFloat();
		System.out.println("enter marks of subject3");
		subject3=scr.nextFloat();
		
		if(subject1>60 && subject2>60 && subject3>60)
		{
			System.out.println("Passed");
		}
		else if((subject1>60 && subject2>60 && subject3<60)
				|| (subject2>60 && subject3>60 && subject1<60)
				|| (subject1>60 && subject3>60 && subject2<60))
		{
			System.out.println("Prompted");

		}
		else
		{
			System.out.println("failed");

		}
		
		scr.close();
	}

}
