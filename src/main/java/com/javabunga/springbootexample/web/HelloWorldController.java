package com.javabunga.springbootexample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.javabunga.springbootexample.model.Employee;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!!";
    }
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstService(@RequestParam int id) {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId(id);
        emp.setSalary(3000);
        return emp;
    }
}
