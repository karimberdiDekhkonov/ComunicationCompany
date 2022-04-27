package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Role;
import uz.pdp.comunicationcompany.entity.USSDCode;

import java.util.UUID;

@RepositoryRestResource(path = "ussdCode")
public interface USSDCodeRepository extends JpaRepository<USSDCode, UUID> {
}
