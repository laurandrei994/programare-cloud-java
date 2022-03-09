package com.unitbv.stereotype.model;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private Integer id;
    private String name;

    @Autowired
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
