package com.oryshchych.qr.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    @CreationTimestamp
    private LocalDateTime registrationDate;

    @Column
    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @Column
    private RoleType roleType;
}

