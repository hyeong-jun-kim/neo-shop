package com.toy.NeoShop.adapter.ports.out;

import org.apache.ibatis.annotations.Mapper;

import com.toy.NeoShop.domain.entity.Seller;

@Mapper
public interface SellerMapper {
	void insertSeller(Seller seller);

	Seller selectSellerByEmail(String email);
}
