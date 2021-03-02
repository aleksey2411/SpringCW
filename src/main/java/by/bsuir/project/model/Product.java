package by.bsuir.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseEntity implements Serializable {
    private String name;
    private int quantity;
    private int price;
    private String manufacturer;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Supplier supplier;
    private ProductStatus status;

    @Builder
    public Product(UUID id, String name, int quantity, int price, String manufacturer,
                   Customer customer, Supplier supplier, ProductStatus status) {
        super(id);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
        this.customer = customer;
        this.supplier = supplier;
        this.status = status;
    }
}
