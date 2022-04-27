package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Role;
import uz.pdp.comunicationcompany.entity.User;

import java.util.UUID;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, UUID> {
}
