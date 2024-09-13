package com.toy.NeoShop.domain.entity;

public interface User {
	String name();
	String email();
	String password();
	String phoneNumber();
	UserRole userRole();
}
