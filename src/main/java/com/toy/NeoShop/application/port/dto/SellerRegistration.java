package com.toy.NeoShop.application.port.dto;

import com.toy.NeoShop.adapter.dto.auth.SellerRegistrationRequest;
import com.toy.NeoShop.domain.entity.Seller;
import com.toy.NeoShop.domain.vo.ShippingAddress;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SellerRegistration {
	private String email;
	private String password;
	private String name;
	private String nickName;
	private String phoneNumber;
	private String shopName;
	private String senderName;
	private String contactNumber;
	private String address;
	private String zipCode;

	public static SellerRegistration from(SellerRegistrationRequest request) {
		return SellerRegistration.builder()
			.email(request.email())
			.password(request.password())
			.name(request.name())
			.phoneNumber(request.phoneNumber())
			.shopName(request.shopName())
			.nickName(request.nickName())
			.senderName(request.senderName())
			.contactNumber(request.contactNumber())
			.address(request.address())
			.zipCode(request.zipCode())
			.build();
	}

	public Seller toSeller() {
		ShippingAddress shippingAddress = new ShippingAddress(this.senderName, this.contactNumber, this.address, this.zipCode);
		return Seller.builder()
			.email(this.email)
			.password(this.password)
			.name(this.name)
			.phoneNumber(this.phoneNumber)
			.nickName(this.nickName)
			.phoneNumber(this.phoneNumber)
			.shopName(this.shopName)
			.shippingAddress(shippingAddress)
			.build();
	}
}
