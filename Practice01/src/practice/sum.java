package practice;

public class sum {

	public static void main(String[] args) {
		
		char operator = '/';
		int num1 = 10;
		int num2 = 5;
		
		if(operator == '+') {
			System.out.println("������� " + (num1 + num2) + "�Դϴ�");
		}
		else if (operator == '-') {
			System.out.println("������� " + (num1 - num2) + "�Դϴ�");
		}
		else if (operator == '*') {
			System.out.println("������� " + (num1*num2) + "�Դϴ�");
		}
		else {
			System.out.println("������� " + (num1/num2) + "�Դϴ�");
		}

	}

}
