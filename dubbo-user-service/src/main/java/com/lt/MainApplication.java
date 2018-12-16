package com.lt;

import com.lt.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : litang
 * @date : Create in 2018-12-16
 * @Description
 */
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();
    }
}
