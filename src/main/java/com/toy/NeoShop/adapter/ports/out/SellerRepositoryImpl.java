package com.toy.NeoShop.adapter.ports.out;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.toy.NeoShop.application.port.out.SellerRepository;
import com.toy.NeoShop.domain.entity.Seller;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SellerRepositoryImpl implements SellerRepository {
	private final SellerMapper sellerMapper;

	@Override
	public void save(Seller seller) {
		sellerMapper.insertSeller(seller);
	}

	@Override
	public Optional<Seller> findByEmail(String email) {
		Seller seller = sellerMapper.selectSellerByEmail(email);
		return Optional.ofNullable(seller);
	}
}
