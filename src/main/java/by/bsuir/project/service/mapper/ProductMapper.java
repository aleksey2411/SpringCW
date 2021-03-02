package by.bsuir.project.service.mapper;

import by.bsuir.project.dto.ProductDto;
import by.bsuir.project.model.Product;
import by.bsuir.project.service.interfaces.MapperService;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper implements MapperService<Product, ProductDto> {
    @Override
    public ProductDto toDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName()).build();

    }

    @Override
    public Product toEntity(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName()).build();
    }
}
