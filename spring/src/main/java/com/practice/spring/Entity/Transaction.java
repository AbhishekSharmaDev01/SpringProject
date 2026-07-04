package com.practice.spring.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId; // Our internal Details
    private double amount; // Provided by DTO
    private String cardId; // Provided by DTO
    private String location; // Provided by DTO
    private LocalDateTime timeStamp; // internal
    private String status; // Fraud Detection {Approval/ Flagged}

}