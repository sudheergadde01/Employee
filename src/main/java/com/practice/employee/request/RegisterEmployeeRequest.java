package com.practice.employee.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterEmployeeRequest {

    private String name;
    private Integer age;
    private Float salary;

}
