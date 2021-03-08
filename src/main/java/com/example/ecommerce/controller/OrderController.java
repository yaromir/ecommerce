package com.example.ecommerce.controller;

import com.example.ecommerce.dto.OrderDto;
import com.example.ecommerce.dto.OrderPlacementRequest;
import com.example.ecommerce.dto.OrderPlacementResponse;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Error handling?
    @GetMapping("/orders")
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Error handling?
    @PostMapping("/orders")
    public OrderPlacementResponse placeOrder(OrderPlacementRequest orderPlacementRequest) {
        return orderService.placeOrder(orderPlacementRequest);
    }

}
