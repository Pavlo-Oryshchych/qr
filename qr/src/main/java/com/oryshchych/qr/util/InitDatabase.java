package com.oryshchych.qr.util;

import com.github.javafaker.Faker;
import com.oryshchych.qr.entity.QrCodeEntity;
import com.oryshchych.qr.entity.RoleType;
import com.oryshchych.qr.entity.UserEntity;
import org.hibernate.Session;
import java.time.LocalDateTime;

public class InitDatabase {


    public static void populateDatabase(Session session) {
        Faker faker = new Faker();


        // Generate UserEntity instances
        for (int i = 0; i < 10; i++) {
            UserEntity user = new UserEntity();
            user.setUsername(faker.name().username());
            user.setPassword(faker.internet().password());
            user.setRegistrationDate(LocalDateTime.now());
            user.setRoleType(RoleType.values()[faker.random().nextInt(RoleType.values().length)]);
            session.save(user);
        }

        // Generate QrCodeEntity instances
        for (int i = 0; i < 10; i++) {
            QrCodeEntity qrCode = new QrCodeEntity();
            qrCode.setUserId(String.valueOf(faker.number().randomNumber()));
            qrCode.setCreationDate(LocalDateTime.now());
            qrCode.setContent(faker.internet().uuid());
            session.save(qrCode);
        }

        session.getTransaction().commit();

    }
}



