package by.bsuir.project.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserStatus {
    ENABLE, BLOCKED, NOT_CONFIRMED;

    @JsonValue
    public String getStatus() {
        return this.name();
    }
}
