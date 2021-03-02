package by.bsuir.project.service.interfaces;

import by.bsuir.project.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product save(Product product);
    Product findById(UUID id);
    List<Product> findAll();
}
