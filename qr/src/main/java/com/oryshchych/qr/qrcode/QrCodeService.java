package com.oryshchych.qr.qrcode;

import com.oryshchych.qr.user.QrCodeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QrCodeService {

    @Autowired
    private QrCodeRepository qrCodeRepository;

    public List<QrCodeEntity> getAllQrCodes() {
        List<QrCodeEntity> list = qrCodeRepository.findAll();
        return list;
    }

    public QrCodeEntity createQrCode(QrCodeEntity qrCodeEntity) {
        return qrCodeRepository.save(qrCodeEntity);
    }

    public void deleteQrCode(Long id) {
        qrCodeRepository.deleteById(id);
    }
}
