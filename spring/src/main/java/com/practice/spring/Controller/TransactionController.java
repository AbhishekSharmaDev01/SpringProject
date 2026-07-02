package com.practice.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.DTO.TransactionDTO;
import com.practice.spring.Entity.Transaction;
import com.practice.spring.Service.TransactionService;

import java.util.Collection;


@RestController
@RequestMapping("/")
public class TransactionController{
    @Autowired
    TransactionService transService;

    @PostMapping
    public Transaction addTransaction(@RequestBody TransactionDTO rb ){
        return transService.saveTransaction(rb);
    }
    @GetMapping
    public Collection<Transaction> getTransaction(){
        return transService.getTransaction();
    }
    @GetMapping("/{id}")
    public Transaction getTransaction(@RequestParam String id){
        return transService.getTransactionId(id);
    }
}