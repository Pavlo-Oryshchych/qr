package com.oryshchych.qr.service;

import com.oryshchych.qr.entity.QrCodeEntity;
import com.oryshchych.qr.repository.QrCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QrCodeService {

    @Autowired
    private QrCodeRepository qrCodeRepository;

    //Заглушка для получения всех пользователей
    public List<QrCodeEntity> getAllQrCodes() {
        List<QrCodeEntity> list = qrCodeRepository.findAll();
        return new ArrayList<>();
    }

    public List<QrCodeEntity> findCodesByUserId(Long userId) {
        return qrCodeRepository.getQrByUserId(userId);
    }

    public QrCodeEntity getQrCodeById(Long id) {
        return qrCodeRepository.findById(id).orElse(null);
    }

    public QrCodeEntity createQrCode(QrCodeEntity qrCodeEntity) {
        return qrCodeRepository.save(qrCodeEntity);
    }

    public void deleteQrCode(Long id) {
        qrCodeRepository.deleteById(id);
    }

}
