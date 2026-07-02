package com.practice.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.Entity.Transaction;
import com.practice.spring.Service.TransactionService;


@RestController
@RequestMapping("/")
public class TransactionController{
    @Autowired
    TransactionService transService;

    @PostMapping
    public Transaction saveTheTRans(@RequestBody Transaction rb ){
        return transService.saveTrans(rb);
    }
}