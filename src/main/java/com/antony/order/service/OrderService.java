package com.antony.order.service;

import java.util.List;
import java.util.Optional;

import com.antony.order.dto.Order;

/**
 * 
 * @author Antony John
 *
 */
public interface OrderService {
	
	public Order createOrder(Order order);
	public List<Order> getAllOrderList();
	public Optional<Order> getOrderDetails(Integer id);

}
