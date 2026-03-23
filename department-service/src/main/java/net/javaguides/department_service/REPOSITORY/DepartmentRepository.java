package net.javaguides.department_service.REPOSITORY;

import net.javaguides.department_service.ENTITY.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentCode(String departmentCode);
}
