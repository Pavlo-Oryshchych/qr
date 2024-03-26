package com.oryshchych.qr.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
@Data
@Entity


public class QrCode {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime creationDateTime;

}

