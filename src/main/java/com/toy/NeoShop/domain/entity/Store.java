package com.toy.NeoShop.domain.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;

@Builder
public record Store(
	long storeId,
	String storeName,
	String description,
	String address,
	String url,
	List<Product> productList,
	Seller seller,
	LocalDate createDate
) {
}
