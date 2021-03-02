package by.bsuir.project.dto;

import by.bsuir.project.model.UserRole;
import by.bsuir.project.model.UserStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.UUID;

@Builder
@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto implements Serializable {
    private UUID id;
    private String email;
    private String password;
    @Transient
    private String confirmPassword;
    private UserRole userRole;
    private UserStatus userStatus;
}
