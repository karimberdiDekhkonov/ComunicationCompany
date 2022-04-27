package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Employee;

import java.util.UUID;
@RepositoryRestResource(path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
