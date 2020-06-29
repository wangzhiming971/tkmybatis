package com.wang.controller;

import com.wang.dto.Dept;
import com.wang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/get/{deptNo}")
    @ResponseBody
    public Dept getByDeptNo(@PathVariable("deptNo") Long deptNo){
        Dept dept = deptService.getByDeptNo(deptNo);
        System.out.println(dept);
        return dept;
    }


    @RequestMapping(value = "get/list")
    @ResponseBody
    public List<Dept>  queryAll(){
       List<Dept> list = deptService.queryAll();
       for (Dept dept:list){
           System.out.println(dept);
       }
       return  list;
    }
}
