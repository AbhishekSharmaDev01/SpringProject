package com.practice.spring.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

import com.practice.spring.Entity.Transaction;

@Repository
public class TransactionRepo{
    private final Map<String,Transaction> db = new ConcurrentHashMap<>();

    public Transaction save(Transaction transaction){
        db.put(transaction.getTransactionId(),transaction);
        return transaction;
    }
    public Collection<Transaction> getTransaction(){
        return db.values();
    }
    public Transaction getTransactionById(String id){
        return db.get(id);
    }

}