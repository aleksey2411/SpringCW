package by.bsuir.project.repository;

import by.bsuir.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    Customer findById(UUID id);
}
