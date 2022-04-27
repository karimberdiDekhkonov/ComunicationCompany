package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Role;

import java.util.UUID;

@RepositoryRestResource(path = "role")
public interface RoleRepository extends JpaRepository<Role, UUID> {
}
