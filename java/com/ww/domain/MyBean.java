package com.ww.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created on 2016/11/7.
 */
@Component
public class MyBean {

    private String name;

    @Autowired
    public MyBean(@Value("${name}") String prop) {
        this.name = prop;

    }
}
