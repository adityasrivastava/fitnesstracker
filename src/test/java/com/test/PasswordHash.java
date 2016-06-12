package com.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class PasswordHash extends TestCase{
	
	public void testBCryptHash(){
		
		String password = "secret";
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String bcryptPassword = encoder.encode(password);
		System.out.println(bcryptPassword);
	}
	
	public void testMD5Hash(){
		String password = "secret";
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		String hashedPassword = encoder.encodePassword(password, null);
		System.out.println(hashedPassword);
	}

}
