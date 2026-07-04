package com.practice.spring.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO{
@NotEmpty(message = "Card ID is required and cannot be blank") // Validations
private String cardId;
@Positive(message = "Transaction amount must be greater than zero")
private double amount;
@NotEmpty(message = "Location is required")
private String location;

}