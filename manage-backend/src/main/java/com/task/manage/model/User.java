package com.task.manage.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;

    private String password;

}
