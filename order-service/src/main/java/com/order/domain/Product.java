package com.order.domain;

import java.math.BigDecimal;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

	private String id;
	private String name;
	private Integer stock;
	private BigDecimal price;
}