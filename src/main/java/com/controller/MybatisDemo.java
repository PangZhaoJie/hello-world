package com.controller;

import org.springframework.web.bind.annotation.RestController;

import com.Mapper.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/10/29.
 */
@RestController
@RequestMapping("/areas")
public class MybatisDemo {
    @Autowired
    private QueryMapper query;
    @RequestMapping(method = RequestMethod.GET)
    public String selectUser()
    {
        return query.findById();
    }

}

