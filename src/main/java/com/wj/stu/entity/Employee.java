package com.wj.stu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/28 20:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Integer age;
    private Integer version;


}
