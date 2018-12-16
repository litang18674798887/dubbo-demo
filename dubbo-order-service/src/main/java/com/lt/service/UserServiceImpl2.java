package com.lt.service;

import com.lt.bean.UserAddress;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl2 implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "北京市", "1", "李", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市", "1", "王", "010-56253825", "N");
		
		return Arrays.asList(address1,address2);
	}

}
