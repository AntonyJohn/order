package com.antony.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antony.order.dto.Order;
import com.antony.order.service.OrderService;
import com.antony.order.vo.OrderItemVO;
import com.antony.order.vo.OrderVO;

/**
 * 
 * @author Antony John
 *
 */

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
    private OrderService orderService;
	
	@Autowired
	private OrderFeignClient orderFeignClient;
	
	@PostMapping("/create")
	public OrderVO createOrder(@RequestBody OrderVO orderVO) {	
		Order order = new Order();
		order.setCustomerName(orderVO.getCustomerName());
		order.setOrderDate(orderVO.getOrderDate());
		order.setShippingAddress(orderVO.getShippingAddress());
		order.setTotal(orderVO.getTotal());
		Order obj = orderService.createOrder(order);
		if(null != obj) {
			orderVO.setId(obj.getId());
			orderVO.getOrderItem().forEach(e -> e.setOrderId(obj.getId()));
			
			List<OrderItemVO> ordItemVO = orderFeignClient.createOrderItems(orderVO.getOrderItem());
			orderVO.setOrderItem(ordItemVO);			
		}
		return orderVO;
	}
	
	@GetMapping("/getall")
	public List<Order> getAllOrder() throws Exception {
		List<Order> orderList = orderService.getAllOrderList();
		if(orderList.isEmpty()) {
			throw new Exception("Order Not Found");
		}
		return orderList;
	}
	
	@GetMapping("/orderdetails/{orderId}")
	public Optional<Order> getOrderDetails(@PathVariable("orderId") Integer orderId) throws Exception {
		Optional<Order> order = orderService.getOrderDetails(orderId);
		if(!order.isPresent()) {
			throw new Exception("Order Not Found");
		}
		return order;
	}
	
	
}
