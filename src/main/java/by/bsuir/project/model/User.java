package by.bsuir.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity implements Serializable {
    private String email;
    private String password;
    @Transient
    private String confirmPassword;
    private UserRole userRole;
    private UserStatus userStatus;

    @Builder
    public User(UUID id, String email, String password, String confirmPassword,
                UserRole userRole, UserStatus userStatus) {
        super(id);
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.userRole = userRole;
        this.userStatus = userStatus;
    }
}
