package com.example.demo.controller;

import com.example.demo.commom.Response;
import com.example.demo.entity.Teacher;
import com.example.demo.exception.ParamException;
import com.example.demo.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Logger logger = LogManager.getLogger("myLogger");
    @Autowired
    TestService testService;
    @RequestMapping(value = "/word",method =  RequestMethod.GET)
    public  Response<Teacher>  TestMethod(@RequestParam(value = "id") String id) {

        Teacher teacher = null;
        try {
            Integer value = Integer.valueOf(id);
            teacher = testService.queryId(value);


            //   throw new ParamException(ErrorCodeAndMsg.PARAM_EXCEPTION);
        } catch (Exception e) {
            if (e instanceof ParamException) {
                 throw e;
            }
        }

        return  new Response<Teacher>(teacher);

    }
}
