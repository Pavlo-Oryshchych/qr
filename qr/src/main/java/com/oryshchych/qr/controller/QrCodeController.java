package com.oryshchych.qr.controller;

import com.oryshchych.qr.dto.UserDTO;
import com.oryshchych.qr.entity.QrCodeEntity;
import com.oryshchych.qr.service.QrCodeService;
import com.oryshchych.qr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/qrcodes")
public class QrCodeController {


    @Autowired
    private QrCodeService qrCodeService;
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<UserDTO> getUsersDTO() {
        ArrayList<UserDTO> users = new ArrayList<>();
        List<QrCodeEntity> qrCodeEntities = qrCodeService.getAllQrCodes();
        return users;
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
