package com.practice.spring.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO{
private String cardId;
private double amount;
private String location;

}