package com.oryshchych.qr.qrcode;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/qrcode")
@RequiredArgsConstructor
public class QRCodeController {

    @Autowired
    QRCodeGenerator qrCodeGenerator;

    @PostMapping("/generate")
    public String addCustomer(@RequestBody String message) {
        log.info("Input Message is {} ", message);
        qrCodeGenerator.generateQRCode(message);
        return "Created QR Code";
    }
}

