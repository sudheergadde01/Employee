package com.practice.employee.controller;

import com.practice.employee.request.RegisterEmployeeRequest;
import com.practice.employee.response.RegisterEmployeeResponse;
import com.practice.employee.service.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeRegisterController {

//    Field Injection
//    @Autowired
//    private EmployeeRegisterService employeeRegisterService;

//  Constructor Injection

//    private final EmployeeRegisterService employeeRegisterService;
//    @Autowired
//    public EmployeeRegisterController(EmployeeRegisterService employeeRegisterService) {
//        this.employeeRegisterService = employeeRegisterService;
//    }

//  Setter Injection
    private EmployeeRegisterService employeeRegisterService;
    @Autowired
    public void setEmployeeRegisterService(EmployeeRegisterService employeeRegisterService){
        this.employeeRegisterService=employeeRegisterService;
    }

    @PostMapping("/register")
    public RegisterEmployeeResponse registerEmployee(@RequestBody RegisterEmployeeRequest registerEmployeeRequest){
        return employeeRegisterService.registerEmployee(registerEmployeeRequest);
    }

    @PutMapping("/update")
    public RegisterEmployeeResponse updateEmployee(@RequestBody RegisterEmployeeRequest registerEmployeeRequest){
        return employeeRegisterService.registerEmployee(registerEmployeeRequest);
    }
}
