package com.oryshchych.qr.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class QRCodeGenerator {

    private static final String charset = "UTF-8";
    private static final String strDateFormat = "yyyyMMddHHmmss";
    @Value("${qrcode.message}")
    private String qrCodeMessage;
    @Value("${qrcode.output.directory}")
    private String outputLocation;

    public void generateQRCode(String message) {
        log.info("*@*@*@*@*@* Generating QR Code *@*@*@*@*@*");

        log.info("Output directory - {}", outputLocation);
        try {
            String finalMessage = (StringUtils.isBlank(message)) ? qrCodeMessage : message;
            log.info("Final Input Message - {}", finalMessage);


            File outputDirectory = new File(outputLocation);
            if (!outputDirectory.exists()) {
                outputDirectory.mkdirs();
            }

            processQRcode(finalMessage, prepareOutputFileName(), charset, 400, 400);
        } catch (WriterException | IOException e) {
            log.error("Error generating QR code: {}", e.getMessage());
        }
    }

    private String prepareOutputFileName() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);

        StringBuilder sb = new StringBuilder();
        sb.append(outputLocation).append(File.separator).append("QRCode-").append(formattedDate).append(".png");
        log.info("Final output file - " + sb.toString());
        return sb.toString();
    }

    private void processQRcode(String data, String path, String charset, int height, int width) throws WriterException, IOException {
        BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, width, height);
        MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
    }
}
