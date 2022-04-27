package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Card;


import java.util.UUID;

@RepositoryRestResource(path = "card")
public interface CardRepository extends JpaRepository<Card, UUID> {
}
