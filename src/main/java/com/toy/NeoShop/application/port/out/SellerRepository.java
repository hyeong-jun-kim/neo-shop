package com.toy.NeoShop.application.port.out;

import java.util.Optional;

import com.toy.NeoShop.domain.entity.Seller;

public interface SellerRepository {
	void save(Seller seller);

	Optional<Seller> findByEmail(String email);
}
