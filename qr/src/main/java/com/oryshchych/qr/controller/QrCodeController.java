package com.oryshchych.qr.controller;

import com.oryshchych.qr.entity.QrCodeEntity;
import com.oryshchych.qr.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/qr-codes")
public class QrCodeController {

    //TODO: Сделать панель Администратора

    @Autowired
    private QrCodeService qrCodeService;

    @GetMapping
    public List<QrCodeEntity> getAllQrCodes() {
        return qrCodeService.getAllQrCodes();
    }

    @GetMapping("/{id}")
    public QrCodeEntity getQrCodeById(@PathVariable Long id) {
        return qrCodeService.getQrCodeById(id);
    }
    @GetMapping("byuserid/{id}")
    public List<QrCodeEntity> getQrCodeByUserId(@PathVariable Long id) {
        return qrCodeService.findCodesByUserId(id.toString());
    }

    @PostMapping
    public QrCodeEntity createQrCode(@RequestBody QrCodeEntity qrCodeEntity) {
        return qrCodeService.createQrCode(qrCodeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteQrCode(@PathVariable Long id) {
        qrCodeService.deleteQrCode(id);
    }
}
