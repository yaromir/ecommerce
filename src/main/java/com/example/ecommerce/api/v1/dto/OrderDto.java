package com.example.ecommerce.api.v1.dto;

import com.example.ecommerce.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDto {

    private String code;
    private OrderStatus orderStatus;

}
