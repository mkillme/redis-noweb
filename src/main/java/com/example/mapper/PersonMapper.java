package com.example.mapper;

import com.example.bean.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    Person querySomePeople(Integer id);
    Person[] queryAllPeople();
}
