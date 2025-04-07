package com.practice.employee.service;

import com.practice.employee.request.RegisterEmployeeRequest;
import com.practice.employee.response.RegisterEmployeeResponse;

public interface EmployeeRegisterService {
    RegisterEmployeeResponse registerEmployee(RegisterEmployeeRequest registerEmployeeRequest);
}
