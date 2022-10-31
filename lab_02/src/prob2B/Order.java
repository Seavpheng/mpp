package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderLine> orderLine;
	private String orderNum;
	
	public Order(String num) {
		orderNum = num; 
		orderLine = new ArrayList<OrderLine>();
	}
	
	public List<OrderLine> add(){ 
		OrderLine ol = new OrderLine( this);
		orderLine.add(ol);
		return this.orderLine;
	} 
	
	
	public List<OrderLine> getOrderLine(){
		return this.orderLine;
	} 
	
	public String getOrderNum() {
		return orderNum;
	}
	
	public void setOrderNum(String num) {
		orderNum = num;
	}
	
	
	public String toString() {
		 return this.orderNum +" have "+ this.orderLine.toString();
	}
}
