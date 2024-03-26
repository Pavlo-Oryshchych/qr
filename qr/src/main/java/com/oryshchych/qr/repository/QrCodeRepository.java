package com.oryshchych.qr.repository;

import com.oryshchych.qr.entity.QrCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QrCodeRepository extends JpaRepository<QrCode, Long> {
}
