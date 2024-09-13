package com.toy.NeoShop.domain.entity;

import com.toy.NeoShop.domain.vo.ShippingAddress;

import lombok.Builder;

@Builder
public record Seller(
	long sellerId,
	String email,
	String password,
	String name,
	String phoneNumber,
	ShippingAddress shippingAddress) {
}
