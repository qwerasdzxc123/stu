package com.wj.stu.service;

import com.wj.stu.entity.Employee;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/28 22:05
 */
public interface EmpService {
    void insertEmp(Employee emp);
    void deleteEmp(Integer id);
    void updateEmp(Integer id);
}
