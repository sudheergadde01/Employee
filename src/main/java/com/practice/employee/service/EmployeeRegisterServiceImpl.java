package com.practice.employee.service;

import com.practice.employee.entity.EmployeeInfo;
import com.practice.employee.repository.EmployeeRepository;
import com.practice.employee.request.RegisterEmployeeRequest;
import com.practice.employee.response.RegisterEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRegisterServiceImpl implements EmployeeRegisterService{

//    Field Injection
//    @Autowired
//    private EmployeeRepository employeeRepository;

//  Constructor Injection
//    private final EmployeeRepository employeeRepository;
//    @Autowired
//    public EmployeeRegisterServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

//  Setter Injection
    private EmployeeRepository employeeRepository;
    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public RegisterEmployeeResponse registerEmployee(RegisterEmployeeRequest request) {
        RegisterEmployeeResponse response= new RegisterEmployeeResponse();
        EmployeeInfo employeeInfo= new EmployeeInfo();

        employeeInfo.setAge(request.getAge());
        employeeInfo.setName(request.getName());
        employeeInfo.setSalary(request.getSalary());
        employeeRepository.save(employeeInfo);

        response.setMessage("Employee registration successful.");
        response.setStatus(200);


        return response;
    }
}
