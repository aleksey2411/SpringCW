package by.bsuir.project.repository;

import by.bsuir.project.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,String> {
    Supplier findById(UUID id);
}
