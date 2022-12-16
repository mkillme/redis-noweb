package com.example.bean;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
public class Person {
    private Integer id;
    private String name;
    private String sex;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer id, String name, String sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }
}
