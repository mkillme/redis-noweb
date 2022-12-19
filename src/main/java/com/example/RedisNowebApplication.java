package com.example;

import com.example.bean.Person;
import com.example.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class RedisNowebApplication {



    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(RedisNowebApplication.class, args);

/*        PersonMapper obj = (PersonMapper) ac.getBean("personMapper");
        Person p = obj.querySomePeople(1);

        *//**redis*//*
        RedisTemplate<String,String> redisTemplate = (RedisTemplate)ac.getBean("redisTemplate");
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("hello",p);*/

        
    }

}
