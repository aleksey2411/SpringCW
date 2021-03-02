package by.bsuir.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends Client implements Serializable {
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Product> products;
    @Builder
    public Customer(UUID id, String name, String account, String address, int phoneNumber,
                    String UNP, String director) {
        super(id, name, account, address, phoneNumber, UNP, director);
    }
}
