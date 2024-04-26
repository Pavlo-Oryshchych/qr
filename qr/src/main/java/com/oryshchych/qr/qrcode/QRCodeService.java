package com.oryshchych.qr.qrcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QRCodeService {

    @Autowired
    private QRCodeGenerator qrCodeGenerator;
    @Autowired
    private QRCodeRepository qrCodeRepository;

//    public String createQRCode(String content) {
//
//    }


}
