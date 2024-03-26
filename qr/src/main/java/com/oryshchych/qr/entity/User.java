package com.oryshchych.qr.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate registrationDate;

    //TODO: Сделать связь one to many с qr кодами. И подписками!

    //TODO: Создать поля username and password

    //TODO: Связь у одного пользователя к ролям - 1 к , у многих пользователей - 1 роль

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }


}

