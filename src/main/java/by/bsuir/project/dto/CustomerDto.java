package by.bsuir.project.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

@Builder
@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto implements Serializable {
    private UUID id;
    private String name;
    private String account;
    private String address;
    private int phoneNumber;
    private String UNP;
    private String director;
}
