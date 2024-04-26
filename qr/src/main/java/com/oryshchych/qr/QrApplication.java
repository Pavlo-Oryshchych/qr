package com.oryshchych.qr;

import com.oryshchych.qr.qrcode.QRCodeGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class QrApplication implements CommandLineRunner {

    @Autowired
    private QRCodeGenerator qrCodeGenerator;

    public static void main(String[] args) {
        SpringApplication.run(QrApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            log.info("Enter your message: ");
            String inputMessage = scanner.nextLine();
            log.info("Input Message from console - {}", inputMessage);
            if (StringUtils.isNotBlank(inputMessage)) {
                qrCodeGenerator.generateQRCode(inputMessage);
            }
        }
    }
}
