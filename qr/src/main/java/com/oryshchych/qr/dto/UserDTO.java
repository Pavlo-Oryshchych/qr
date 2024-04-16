package com.oryshchych.qr.dto;

import com.oryshchych.qr.models.RoleType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class UserDTO {
    private Long id;
    private LocalDateTime registrationDate;
    private LocalDateTime updatedDate;
    private List<QrCodeDTO> qrCodeDTO;
    private RoleType roleType;

}
