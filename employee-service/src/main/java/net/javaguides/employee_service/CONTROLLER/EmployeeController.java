package net.javaguides.employee_service.CONTROLLER;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.employee_service.DTO.APIResponseDto;
import net.javaguides.employee_service.DTO.EmployeeDto;
import net.javaguides.employee_service.SERVICE.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    //Build save Employee REST API

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);

       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build get Employee by Id REST API

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){

        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
