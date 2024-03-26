package com.oryshchych.qr.repository;

import com.oryshchych.qr.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
