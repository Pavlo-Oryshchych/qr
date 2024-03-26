package com.oryshchych.qr.service;


import com.oryshchych.qr.entity.QrCode;
import com.oryshchych.qr.repository.QrCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QrCodeService {

    @Autowired
    private QrCodeRepository qrCodeRepository;

//TODO: getAllQrCodes нужно сделать получение по id пользователя

    //TODO: сделать запрос по актуальным qr кодам или по всем (можно сдлеать отдельные методы)
    public List<QrCode> getAllQrCodes() {
        return qrCodeRepository.findAll();
    }

    public QrCode getQrCodeById(Long id) {
        return qrCodeRepository.findById(id).orElse(null);
    }

    public QrCode createQrCode(QrCode qrCode) {
        return qrCodeRepository.save(qrCode);
    }

    public void deleteQrCode(Long id) {
        qrCodeRepository.deleteById(id);
    }
}
