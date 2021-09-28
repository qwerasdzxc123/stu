package com.wj.stu.service.impl;

import com.wj.stu.entity.Employee;
import com.wj.stu.mapper.EmpMapper;
import com.wj.stu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/28 22:07
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public void insertEmp(Employee emp) {
        empMapper.insertUser(emp);
    }

    @Override
    public void deleteEmp(Integer id) {
        empMapper.deleteUserById(id);
    }

    @Override
    public void updateEmp(Integer id) {
//       empMapper.updateUserById(id,);
    }

}
