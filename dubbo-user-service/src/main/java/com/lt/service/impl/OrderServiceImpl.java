package com.lt.service.impl;

import com.lt.bean.UserAddress;
import com.lt.service.OrderService;
import com.lt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018-12-16
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
