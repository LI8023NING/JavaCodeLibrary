package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "test")
public class TestController {
    @GetMapping(value = "name")
    public List<Student> getStudentManList() {
        Student stu1 = new Student("lining", 20, "男");
        Student stu2 = new Student("zhangning", 22, "女");
        Student stu3 = new Student("ningzhang", 25, "男");

        List<Student> list = new ArrayList<Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        return list;
    }

    @GetMapping(value = "ning")
    public String getYou(){
        return "nihao";
    }
}
