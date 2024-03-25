package com.vijay.order.controller;

import com.vijay.order.dto.OrderDTO;
import com.vijay.order.dto.OrderDTOResponse;
import com.vijay.order.entity.Order;
import com.vijay.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/saveOrder")
    public ResponseEntity<Order> saveOrder(@RequestBody OrderDTO orderDetails){
        Order order = orderService.saveOrder(orderDetails);
        if(order != null)
        return new ResponseEntity<>(order, HttpStatus.OK);
        else
         return new ResponseEntity<>(order, HttpStatus.NOT_FOUND);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
