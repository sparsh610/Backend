package org.microservice.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    @NotNull(message = "id is missing")
    private Long id;
    @NotNull(message = "name is missing")
    private String name;
    @NotEmpty(message = "address is empty")
    private String address;
}
