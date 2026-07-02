package com.practice.spring.Entity;

import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction{

    private String transactionId; // Our internal Details
    private double amount; // Provided by DTO
    private String cardId; // Provided by DTO
    private String location; // Provided by DTO
    private LocalDateTime timeStamp; // internal
    private String status; // Fraud Detection {Approval/ Flagged}
}