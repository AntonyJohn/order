package com.antony.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antony.order.dto.Order;
import com.antony.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.saveAndFlush(order);
	}

	@Override
	public List<Order> getAllOrderList() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderDetails(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id);
	}

}
