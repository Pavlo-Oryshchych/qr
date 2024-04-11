package com.oryshchych.qr.dto;

import com.oryshchych.qr.entity.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    String name;
    String registrationDate;
    RoleType roleType;
    List<QrCodeDTO> qrCodes;


}
