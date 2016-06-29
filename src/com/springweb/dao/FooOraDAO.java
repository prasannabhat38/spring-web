package com.springweb.dao;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springweb.model.Foo;

@Component
public class FooOraDAO implements FooDAO {
    @Value("${database.type}")
    private String version;
    
    public Foo getFooById(Integer fooId) {
        return new Foo(fooId, version);
    }
    
}
