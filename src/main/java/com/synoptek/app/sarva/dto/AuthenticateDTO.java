package com.synoptek.app.sarva.dto;

import java.util.Arrays;

public class AuthenticateDTO {
	
	private String email;
	
	private char[] usercode;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[] getUsercode() {
		return usercode;
	}

	public void setUsercode(char[] usercode) {
		this.usercode = usercode;
	}

	@Override
	public String toString() {
		return "AuthenticateDTO [email=" + email + ", usercode=" + Arrays.toString(usercode) + "]";
	}
	
	
}
