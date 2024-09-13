package com.toy.NeoShop.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class User {
	private long id;
	private String name;
	private String phoneNumber;
	private String email;
	private String nickName;
}
