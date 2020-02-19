package lesson5.labsolns.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labsolns.prob4.CustOrderFactory;
import lesson5.labsolns.prob4.Customer;
import lesson5.labsolns.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.newItem("Shirt"));
		order.addItem(CustOrderFactory.newItem("Laptop"));

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.newItem("Pants"));
		order.addItem(CustOrderFactory.newItem("Knife set"));

		System.out.println(cust.getOrders());
	}
}

		
