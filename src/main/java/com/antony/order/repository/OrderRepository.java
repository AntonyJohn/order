package com.antony.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.antony.order.dto.Order;


@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
