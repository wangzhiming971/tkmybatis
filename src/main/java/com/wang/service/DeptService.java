package com.wang.service;

import com.wang.dto.Dept;

import java.util.List;

public interface DeptService {
    public Dept getByDeptNo(long deptNo);

    public List<Dept> queryAll();
}
