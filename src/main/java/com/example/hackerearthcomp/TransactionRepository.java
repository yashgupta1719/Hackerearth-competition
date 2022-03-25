package com.example.hackerearthcomp;

import com.example.hackerearthcomp.Model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {

}
