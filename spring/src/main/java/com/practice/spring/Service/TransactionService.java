package com.practice.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.Entity.Transaction;
import com.practice.spring.Repository.TransactionRepo;

@Service
public class TransactionService{
    @Autowired
    TransactionRepo transactionRepo;

    public Transaction saveTrans(Transaction trans){
        return transactionRepo.save(trans);
    }
}