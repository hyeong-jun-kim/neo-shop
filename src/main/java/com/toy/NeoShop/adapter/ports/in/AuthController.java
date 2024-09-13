package com.toy.NeoShop.adapter.ports.in;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toy.NeoShop.adapter.dto.auth.SellerRegistrationRequest;
import com.toy.NeoShop.application.port.dto.SellerRegistration;
import com.toy.NeoShop.domain.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthController {
	private final AuthService authService;

	@PostMapping("/auth/register/seller")
	public void registerSeller(@RequestBody SellerRegistrationRequest sellerRegistrationRequest) {
		SellerRegistration sellerRegistration = SellerRegistration.from(sellerRegistrationRequest);
		authService.register(sellerRegistration);
	}

	@PostMapping("/auth/login/seller")
	public void loginSeller(@RequestBody SellerRegistrationRequest sellerRegistrationRequest) {

	}
}
