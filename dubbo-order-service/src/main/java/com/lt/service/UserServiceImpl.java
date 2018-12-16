package com.lt.service;

import com.lt.bean.UserAddress;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "深圳", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "北京", "1", "王老师", "010-56253825", "N");

		return Arrays.asList(address1,address2);
	}

}
