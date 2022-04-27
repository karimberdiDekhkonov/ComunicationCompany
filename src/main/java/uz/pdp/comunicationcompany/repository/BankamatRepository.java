package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Bankamat;

import java.util.UUID;

@RepositoryRestResource(path = "Bankamat")
public interface BankamatRepository extends JpaRepository<Bankamat, UUID> {
}
