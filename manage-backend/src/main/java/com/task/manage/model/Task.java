package com.task.manage.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String title;
    private String description;
    private int status;
    private int priority;
    private Long assignedUserId;


}