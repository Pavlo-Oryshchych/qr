package com.oryshchych.qr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QrCodeDTO {
    String content;
    String imageURL;

}
