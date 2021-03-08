package com.example.ecommerce.dto;

import com.example.ecommerce.entity.OrderPlacementStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderPlacementResponse {

    private OrderPlacementStatus orderPlacementStatus;

}
