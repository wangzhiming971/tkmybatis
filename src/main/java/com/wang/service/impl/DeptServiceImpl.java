package com.wang.service.impl;


import com.wang.dto.Dept;
import com.wang.mapper.DeptMapper;
import com.wang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl  implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept getByDeptNo(long deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.selectAll();
    }
}
