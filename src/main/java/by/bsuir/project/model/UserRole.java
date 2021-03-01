package by.bsuir.project.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRole {
    ADMIN, USER;

    @JsonValue
    public String getStatus() {
        return this.name();
    }
}
