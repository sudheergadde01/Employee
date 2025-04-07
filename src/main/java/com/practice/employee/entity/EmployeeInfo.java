package com.practice.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee_info")
public class EmployeeInfo {

    @Id
    @GeneratedValue
    private Long empId;
    private String name;
    private Integer age;
    private Float salary;
}
