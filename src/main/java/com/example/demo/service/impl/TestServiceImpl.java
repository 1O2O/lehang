package com.example.demo.service.impl;

import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.TestService;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Teacher queryId(int id) {

      Teacher teacher=  teacherMapper.selectByPrimaryKey(id);
        System.out.println(teacher.getId());
        return teacher;
    }
}
