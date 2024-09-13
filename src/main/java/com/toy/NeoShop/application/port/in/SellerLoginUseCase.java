package com.toy.NeoShop.application.port.in;

import com.toy.NeoShop.adapter.dto.auth.SellerLoginRequest;

public interface SellerLoginUseCase {
	void login(SellerLoginRequest sellerLoginRequest);
}
