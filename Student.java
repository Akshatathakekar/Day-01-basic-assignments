import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studarr[][] = new int[4][4];
		Scanner scr = new Scanner(System.in);
		int i;
		int j;
		int totalscore = 0;
		int average = 0;
		char variable = 'A';

		for (i = 1; i <= 3; i++) {
			System.out.println("Enter marks of student" + i + " for subject A,B,C");
			for (j = 1; j <= 3; j++) {

				studarr[i][j] = scr.nextInt();

			}
		}

		System.out.println("Marks of student" + i + " for subject A,B,C");
		for (i = 1; i <= 3; i++) {

			System.out.println("\nstudent" + i);

			System.out.println("A   B   C");

			for (j = 1; j <= 3; j++) {
				System.out.print(studarr[i][j] + "  ");
			}
			System.out.println();
		}

		for (i = 1; i <= 3; i++) {
			totalscore = 0;
			average = 0;
			for (j = 1; j <= 3; j++) {
				totalscore = studarr[i][j] + totalscore;

			}
			System.out.println("\nTotal score of student " + i + "is " + totalscore);
			average = totalscore / 3;
			System.out.println("average of student " + i + "is " + average);
		}

		System.out.println();

		for (i = 1; i <= 3; i++) {
			totalscore = 0;
			average = 0;

			for (j = 1; j <= 3; j++) {
				totalscore = studarr[j][i] + totalscore;

			}
			System.out.println("Total score for  subject " + variable++ + " is " + totalscore);
			average = totalscore / 3;
			variable--;
			System.out.println("average for each subject " + variable++ + "  is " + average);
		}

		scr.close();
	}

}
