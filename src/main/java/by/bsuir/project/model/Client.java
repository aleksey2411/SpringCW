package by.bsuir.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Client extends BaseEntity implements Serializable {
    private String name;
    private String schet;
    private String address;
    private int phoneNumber;
    private String UNP;
    private String director;
}
