package by.bsuir.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Client extends BaseEntity implements Serializable {
    private String name;
    private String account;
    private String address;
    private int phoneNumber;
    private String UNP;
    private String director;

    public Client(UUID id, String name, String account, String address, int phoneNumber, String UNP, String director) {
        super(id);
        this.name = name;
        this.account = account;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.UNP = UNP;
        this.director = director;
    }
}
