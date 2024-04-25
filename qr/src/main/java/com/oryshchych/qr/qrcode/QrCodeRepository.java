package com.oryshchych.qr.qrcode;

import com.oryshchych.qr.user.QrCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QrCodeRepository extends JpaRepository<QrCodeEntity, Long> {

    @Query("SELECT qr FROM QrCodeEntity qr WHERE qr.userId = :userId")
    List<QrCodeEntity> getQrByUserEmail(@Param("userId") Long userId);

}
