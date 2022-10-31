package lab_5.prob4.extpackage;

import java.time.LocalDate;

import lab_5.prob4.Customer;
import lab_5.prob4.Order;
import lab_5.prob4.CustOrderFactory;

public class Main {
	public static void main(String[] args) {

		Customer cust = CustOrderFactory.createCustomer("Bob");

		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.addItem(order, "Shirt");
		CustOrderFactory.addItem(order, "Laptop");

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.addItem(order,"Pants");
		CustOrderFactory.addItem(order,"Knife set");

		System.out.println(cust.getOrders());
	}
}

		
