package com.practice.spring.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

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
        transaction.setTimeStamp(LocalDateTime.now());
        if(trans.getAmount()>10000 || trans.getAmount()<0)
            transaction.setStatus("Fraud");
        else
            transaction.setStatus("Approved");
        transaction.setTransactionId(UUID.randomUUID().toString());
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