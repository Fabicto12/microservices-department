package net.javaguides.employee_service.SERVICE;

import net.javaguides.employee_service.DTO.APIResponseDto;
import net.javaguides.employee_service.DTO.EmployeeDto;


public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
