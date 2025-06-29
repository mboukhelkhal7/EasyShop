package com.uup.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartItemDTO {
    private ProductDTO product;
    private int quantity;
    private int discountPercent;
    private BigDecimal lineTotal;
}