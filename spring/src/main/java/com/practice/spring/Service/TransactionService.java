package com.practice.spring.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.DTO.TransactionDTO;
import com.practice.spring.Entity.Transaction;
import com.practice.spring.Repository.TransactionRepo;

@Service
public class TransactionService{
    @Autowired
    TransactionRepo transactionRepo;

    public Transaction saveTransaction(TransactionDTO trans){
        Transaction transaction = new Transaction();
        LocalDateTime dt = LocalDateTime.now();
        Random rd = new Random();
        transaction.setTimeStamp(dt);
        transaction.setStatus("Approved");
        transaction.setTransactionId(Integer.toString(rd.nextInt()));
        transaction.setAmount(trans.getAmount());
        transaction.setLocation(trans.getLocation());
        transaction.setCardId(trans.getCardId());
        return transactionRepo.save(transaction);
    }

    public Collection<Transaction> getTransaction(){
        return transactionRepo.getTransaction();
    }
    public Transaction getTransactionId(String id){
        return transactionRepo.getTransactionById(id);
    }
}