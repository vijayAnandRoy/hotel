package com.vijay.order.repository;

import com.vijay.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {
}
