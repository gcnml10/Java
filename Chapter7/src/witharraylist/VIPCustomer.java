package witharraylist;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		
		//super();�ڵ� ���� but ��������� �Ű������� �ִ� � �����ڸ� ����� ������  ����(super()�� ����)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
//		System.out.println("VIPCustomer() ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price = (int)(price *(1 - salesRatio));
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	} 

}
