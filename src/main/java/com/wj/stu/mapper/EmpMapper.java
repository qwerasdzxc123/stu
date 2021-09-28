package com.wj.stu.mapper;

import com.wj.stu.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/28 17:39
 */
@Mapper
public interface EmpMapper {

    void insertUser(Employee employee);
    int deleteUserById(Integer id);
    int updateUserById(
            @Param("id") Integer id,
            @Param("lastName") String lastName,
            @Param("email") String email,
            @Param("gender") String gender,
            @Param("age") Integer age,
            @Param("version") Integer version
    );

    List<Employee> selectUserById(Integer id);
}
