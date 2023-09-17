package org.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "user")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserEntity implements Serializable {
    public UserEntity(Integer id, String name, String salary, String emailid, String address, Date dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.emailid = emailid;
        this.address = address;
        this.dob = dob;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String salary;
    @Column(unique = true)
    private String emailid;
    @Column
    private String address;
    @Column
    private Date dob;
}
