package com.karishma.task_management.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @Builder.Default

    private String id= UUID.randomUUID().toString();

    private String name;
    private String email;
    private String password;
    private String role;
    @OneToMany(mappedBy="user")
    private List<Task> tasks;


}
