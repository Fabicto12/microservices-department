package net.javaguides.department_service.SERVICE;

import net.javaguides.department_service.DTO.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);

}
