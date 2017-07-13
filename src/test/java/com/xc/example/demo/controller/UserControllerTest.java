package com.xc.example.demo.controller;

import com.xc.example.demo.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by xc on 17-7-3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserMapper dao;

    @Test
    public void index() throws Exception {
        System.out.println(dao.getAll().toString());
    }

}