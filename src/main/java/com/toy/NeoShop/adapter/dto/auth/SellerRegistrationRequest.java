package com.toy.NeoShop.adapter.dto.auth;

public record SellerRegistrationRequest(
	String email,
	String password,
	String name,
	String nickName,
	String phoneNumber,
	String shopName,
	String senderName,
	String contactNumber,
	String address,
	String zipCode
) {
}
