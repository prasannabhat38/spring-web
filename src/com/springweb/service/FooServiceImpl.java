package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.dao.FooDAO;
import com.springweb.model.Foo;

@Component("fooService")
public class FooServiceImpl implements FooService {
    @Autowired
    private FooDAO fooDAO;
    
    @Override
    public Foo getFooById(Integer fooId) {
        return fooDAO.getFooById(fooId);
    }
    
}
