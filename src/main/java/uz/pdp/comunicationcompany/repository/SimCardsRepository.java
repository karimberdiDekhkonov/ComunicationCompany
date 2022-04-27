package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Role;
import uz.pdp.comunicationcompany.entity.SimCards;

import java.util.UUID;

@RepositoryRestResource(path = "simCard")
public interface SimCardsRepository extends JpaRepository<SimCards, UUID> {
}
