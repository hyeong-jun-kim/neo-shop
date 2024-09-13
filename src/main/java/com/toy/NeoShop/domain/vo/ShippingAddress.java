package com.toy.NeoShop.domain.vo;

public record ShippingAddress(
	String senderName,
	String contactNumber,
	String address,
	String zipCode
) {
}
