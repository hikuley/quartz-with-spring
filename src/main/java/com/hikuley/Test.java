package com.hikuley;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hikuley on 15.11.2015.
 */
public class Test {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-context.xml");
    }
}
