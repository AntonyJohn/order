package com.antony.order.vo;

import java.io.Serializable;
import java.util.List;

public class OrderVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String customerName;
    private String orderDate;
    private String shippingAddress;
    private List<OrderItemVO> orderItem;
    private int total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}	

	public List<OrderItemVO> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItemVO> orderItem) {
		this.orderItem = orderItem;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
    
    

}
