package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerKim = new VIPCustomer(10020, "������", 21234);
		Customer customerShin = new Customer(10030, "�Ż��Ӵ�");
		Customer customerYul = new GoldCustomer(10040, "������");
		Customer customerHong = new GoldCustomer(10050, "ȫ�浿");
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerShin);
		customerList.add(customerYul);
		customerList.add(customerHong);
		
		System.out.println("=============���������");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("============�������� ���ʽ� ����Ʈ ���");
		
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
		}

	}

}
