package com.oryshchych.qr.qrcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QrCodeDTO {
    Long id;
    String content;
    String imageURL;

}
