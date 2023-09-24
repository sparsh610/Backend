package org.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Entity(name="user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
}
