package com.lt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : litang
 * @date : Create in 2018-12-16
 * @Description
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }
}
