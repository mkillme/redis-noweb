package com.example.controller;

import com.example.bean.Person;
import com.example.service.PersonService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@Controller
public class MyController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/get/{id}")
    @ResponseBody
    public Person getPerson(@PathVariable Integer id){
        System.out.println("------------------------------");
        Person person = personService.querySomePeople(id);
        return person;
    }

    @RequestMapping("/all")
    @ResponseBody
    public Person[] all(){
        Person[] person = personService.queryAllPeople();
        return person;
    }


    @RequestMapping("/get2")
    @ResponseBody
    public String getPerson2(){
        Integer id = 1;
        return personService.querySomePeople(id).toString();
    }
    @RequestMapping("/get3")
    @ResponseBody
    public Person getPerson3(){
        Integer id = 1;
        return personService.querySomePeople(id);
    }

    @RequestMapping("/th/{id}")
    public String tyGetName(@PathVariable Integer id, Model model, HttpServletRequest request){
        Person person = new Person(1199,"lihua","man","jiangsu");
        if (person.getId().equals(id)){
            request.setAttribute("name","zhangsan");
            model.addAttribute("name",person.getName());
        }
        return "a";
    }
}
