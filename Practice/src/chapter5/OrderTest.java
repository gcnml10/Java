package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderNum = 201907210001L;
		order.customerId = "abc123";
		order.date = "2019�� 7�� 21��";
		order.customerName = "ȫ���";
		order.prodectNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order.orderNum);
		System.out.println("�ֹ��� ���̵�: " + order.customerId);
		System.out.println("�ֹ� ��¥: " + order.date);
		System.out.println("�ֹ��� �̸�: " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order.prodectNum);
		System.out.println("��� �ּ�: " + order.address);
		

	}

}
