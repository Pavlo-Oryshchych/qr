package com.oryshchych.qr.controller;

import com.oryshchych.qr.entity.QrCode;
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
    public List<QrCode> getAllQrCodes() {
        return qrCodeService.getAllQrCodes();
    }

    @GetMapping("/{id}")
    public QrCode getQrCodeById(@PathVariable Long id) {
        return qrCodeService.getQrCodeById(id);
    }

    @PostMapping
    public QrCode createQrCode(@RequestBody QrCode qrCode) {
        return qrCodeService.createQrCode(qrCode);
    }

    @DeleteMapping("/{id}")
    public void deleteQrCode(@PathVariable Long id) {
        qrCodeService.deleteQrCode(id);
    }
}
