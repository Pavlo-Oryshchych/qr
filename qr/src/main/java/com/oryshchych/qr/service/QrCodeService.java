package com.oryshchych.qr.service;


import com.oryshchych.qr.entity.QrCodeEntity;
import com.oryshchych.qr.repository.QrCodeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QrCodeService {

    @Autowired
    private QrCodeRepository qrCodeRepository;


    //TODO: сделать запрос по актуальным qr кодам или по всем (можно сдлеать отдельные методы)
    public List<QrCodeEntity> getAllQrCodes() {
        return qrCodeRepository.findAll();
    }

    public List<QrCodeEntity> findCodesByUserId(String userId) {
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
