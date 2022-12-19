package com.example.service.impl;

import com.example.bean.Person;
import com.example.mapper.PersonMapper;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person querySomePeople(Integer id) {
        return personMapper.querySomePeople(id);
    }

    @Override
    public Person[] queryAllPeople() {
        return personMapper.queryAllPeople();
    }
}
