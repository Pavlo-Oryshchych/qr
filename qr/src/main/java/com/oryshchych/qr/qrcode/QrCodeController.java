package com.oryshchych.qr.qrcode;

import com.oryshchych.qr.user.QrCodeEntity;
import com.oryshchych.qr.user.User;
import com.oryshchych.qr.user.UserService;
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
    public List<User> getUsersDTO() {
        ArrayList<User> users = new ArrayList<>();
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
