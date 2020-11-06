package practice;

import java.util.Scanner;

public class daiamond {

	public static void main(String[] args) {
		
		System.out.println("홀수 값을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int lineNumber = scanner.nextInt();
		
		int starNumber = 1;
		int spaceNumber = (lineNumber - 1)/2;

		
		for(int i=1; i<= lineNumber; i++) {
			System.out.println("\s".repeat(spaceNumber) + "*".repeat(starNumber) + "\s".repeat(spaceNumber));
			if (i < (lineNumber/2+1)) {
				starNumber += 2;
				spaceNumber -= 1;
			}
			else {
				starNumber -= 2;
				spaceNumber += 1;
			}
			}
		}
		

	}


