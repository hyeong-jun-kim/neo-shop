package com.toy.NeoShop.domain.service;

import org.springframework.stereotype.Service;

import com.toy.NeoShop.adapter.dto.auth.SellerLoginRequest;
import com.toy.NeoShop.application.port.dto.SellerRegistration;
import com.toy.NeoShop.application.port.in.SellerLoginUseCase;
import com.toy.NeoShop.application.port.in.SellerRegistrationUseCase;
import com.toy.NeoShop.application.port.out.SellerRepository;
import com.toy.NeoShop.domain.entity.Seller;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService implements SellerRegistrationUseCase, SellerLoginUseCase {
	private final SellerRepository sellerRepository;

	@Override
	public void register(SellerRegistration sellerRegistration) {
		Seller seller = sellerRegistration.toSeller();
		sellerRepository.save(seller);
	}

	@Override
	public void login(SellerLoginRequest sellerLoginRequest) {

		sellerRepository.findByEmail(sellerLoginRequest.email())
			.orElseThrow(() -> )
	}
}
