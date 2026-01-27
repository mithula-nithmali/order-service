package com.microservices.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id , String OrderNumber , String skuCode,
                           BigDecimal price , Integer quantity) {
}
