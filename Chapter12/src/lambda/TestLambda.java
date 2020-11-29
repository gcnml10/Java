package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyStirng(lambdaStr);
		
		PrintString test = retrunString();
		test.showString("Test3");
	}
	
	public static void showMyStirng(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString retrunString() {
		return s->System.out.println(s+"!!!");
	}
	

}
