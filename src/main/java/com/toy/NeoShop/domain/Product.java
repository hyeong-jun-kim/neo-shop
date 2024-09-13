package com.toy.NeoShop.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Product {
	private long sellerId;
	private String sellerName;

	private String name;
	private String description;
	private String imageUrl;
	private long price;

}
