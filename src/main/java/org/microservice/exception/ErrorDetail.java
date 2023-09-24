package org.microservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class ErrorDetail {

    private String message;
    private LocalDate localDate;
    private String description;

}
