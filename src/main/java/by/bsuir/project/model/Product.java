package by.bsuir.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

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
}
