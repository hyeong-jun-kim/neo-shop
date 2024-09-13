package com.toy.NeoShop.domain.entity;

import lombok.Builder;

@Builder
public record Product(
	long productId,
	String productName,

) {
}
