package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Users;

import java.util.UUID;

@RepositoryRestResource(path = "users")
public interface UsersRepository extends JpaRepository<Users, UUID> {
}
