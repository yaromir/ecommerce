package com.example.ecommerce.service;

import com.example.ecommerce.api.v1.dto.OrderDto;
import com.example.ecommerce.api.v1.dto.OrderPlacementRequest;
import com.example.ecommerce.api.v1.dto.OrderPlacementResponse;
import com.example.ecommerce.entity.OrderPlacementStatus;
import com.example.ecommerce.entity.OrderStatus;
import com.example.ecommerce.exception.BusinessLogicException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    public List<OrderDto> getAllOrders() {
        // Imitating possible error conditions.
        double responseOutcome = Math.random();
        if(responseOutcome < 0.5) {
            return List.of(
                    new OrderDto("CAE-173556", OrderStatus.NEW)
            );
        } else {
            throw new SecurityException();
        }
    }

    @Transactional
    public OrderPlacementResponse placeOrder(OrderPlacementRequest orderPlacementRequest) {
        // Imitating possible error conditions.
        double responseOutcome = Math.random();
        if(responseOutcome < 0.25) {
            return new OrderPlacementResponse(OrderPlacementStatus.SUCCESS);
        } else if(responseOutcome < 0.50) {
            throw new BusinessLogicException();
        } else if(responseOutcome < 0.75) {
            throw new SecurityException();
        } else {
            throw new DataIntegrityViolationException("Some data integrity violation.");
        }
    }

}
