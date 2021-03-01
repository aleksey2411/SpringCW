package by.bsuir.project.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductStatus {
    IN_STOCK, SOLD_OUT;

    @JsonValue
    public String getStatus() {
        return this.name();
    }
}
