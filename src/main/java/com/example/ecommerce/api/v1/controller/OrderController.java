package com.example.ecommerce.api.v1.controller;

import com.example.ecommerce.api.v1.dto.OrderDto;
import com.example.ecommerce.api.v1.dto.OrderPlacementRequest;
import com.example.ecommerce.api.v1.dto.OrderPlacementResponse;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
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
