package com.epam.basic_spring.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@Table(name = "user_entity")
public class UserEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;
}
