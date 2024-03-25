package com.vijay.order.service;

import com.vijay.order.dto.OrderDTO;
import com.vijay.order.dto.OrderDTOResponse;
import com.vijay.order.dto.UserDTO;
import com.vijay.order.entity.Order;
import com.vijay.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService
{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public Order saveOrder(OrderDTO orderDetails){
        int orderId = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetails(orderDetails.getUserId());
        Order order = new Order(orderId, orderDetails.getFoodItemsList(), userDTO, orderDetails.getRestaurentDTO());
        orderRepository.save(order);
        return order;
    }

    private UserDTO fetchUserDetails(int userId){
        return restTemplate.getForObject("http://USER-SERVICE/user/fetchUser/"+userId, UserDTO.class);
    }

}
