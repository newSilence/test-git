package com.shui.study.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class UserControllerTest {
    @Resource
    UserController userController = new UserController();
    @Test
    public void test(){
        System.out.println(userController);
    }
}