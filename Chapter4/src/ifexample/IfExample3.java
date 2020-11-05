package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		char grade = ' ';
		
		if (score >89) {
			grade = 'A';
		}
		else if (score >79) {
			grade = 'B';
		}
		else if (score >69) {
			grade = 'C';
		}
		else if (score >59) {
			grade = 'D';
		}
		else if (score >49) {
			grade = 'E';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("score: " + score);
		System.out.println("grade: " + grade);
		*/
		
		int a = 10;
		int b = 20;
		
		int max;
		
		max = (a>b)? a:b;
		System.out.println(max);

	}

}
