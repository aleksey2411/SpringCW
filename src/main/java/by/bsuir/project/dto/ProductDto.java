package by.bsuir.project.dto;

import by.bsuir.project.model.Customer;
import by.bsuir.project.model.ProductStatus;
import by.bsuir.project.model.Supplier;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.UUID;

@Builder
@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto implements Serializable {
    private UUID id;
    private String name;
    private int quantity;
    private int price;
    private String manufacturer;
    private Customer customer;
    private Supplier supplier;
}
