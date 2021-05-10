package com.example.ecommerce.api.v1.dto;

import com.example.ecommerce.entity.OrderPlacementStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderPlacementResponse {

    private OrderPlacementStatus orderPlacementStatus;

}
