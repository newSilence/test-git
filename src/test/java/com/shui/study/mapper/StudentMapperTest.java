package com.shui.study.mapper;

import com.shui.study.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
@SpringBootTest
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;
    @Test
    public void findAll1(){
        List<Student> studentList= studentMapper.findAll();
        System.out.println(studentList);
    }
}