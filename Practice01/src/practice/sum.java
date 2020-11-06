package practice;

public class sum {

	public static void main(String[] args) {
		
		char operator = '/';
		int num1 = 10;
		int num2 = 5;
		
		if(operator == '+') {
			System.out.println("결과값은 " + (num1 + num2) + "입니다");
		}
		else if (operator == '-') {
			System.out.println("결과값은 " + (num1 - num2) + "입니다");
		}
		else if (operator == '*') {
			System.out.println("결과값은 " + (num1*num2) + "입니다");
		}
		else {
			System.out.println("결과값은 " + (num1/num2) + "입니다");
		}

	}

}
