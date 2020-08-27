package com.antony.order.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.antony.order.vo.OrderItemVO;

@FeignClient(name = "orderfeign", url = "http://localhost:8787")
@Component
public interface OrderFeignClient {

	@PostMapping("/orderitem/create")
	public List<OrderItemVO> createOrderItems(List<OrderItemVO> orderItems);
}
