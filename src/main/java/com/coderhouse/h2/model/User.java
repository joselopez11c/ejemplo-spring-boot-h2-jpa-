package com.coderhouse.h2.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private Date birthDate;
    private String phone;
    @OneToMany(mappedBy = "id")
    private List<Role> roles;
    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;

}
