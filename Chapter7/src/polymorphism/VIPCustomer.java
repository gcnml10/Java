package polymorphism;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		
		//super();자동 생성 but 명시적으로 매개변수가 있는 어떤 생성자를 만들어 버리면  에러(super()가 없음)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
//		System.out.println("VIPCustomer() 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price = (int)(price *(1 - salesRatio));
	}

}
