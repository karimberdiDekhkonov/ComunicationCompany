package uz.pdp.comunicationcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.comunicationcompany.entity.Bank;

import java.util.UUID;
@RepositoryRestResource(path = "bank")
public interface BankRepository extends JpaRepository<Bank, UUID> {
}
