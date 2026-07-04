package com.practice.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.spring.Entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,String> {

}