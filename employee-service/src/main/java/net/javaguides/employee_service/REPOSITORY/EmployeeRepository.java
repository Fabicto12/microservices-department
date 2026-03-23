package net.javaguides.employee_service.REPOSITORY;

import net.javaguides.employee_service.ENTITY.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
