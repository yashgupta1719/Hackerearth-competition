package com.example.hackerearthcomp;

import com.example.hackerearthcomp.Model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping("/transactions")
    public List<Transaction> getTransaction() {
        return transactionService.getTransactionList();
    }

    @RequestMapping(method= RequestMethod.POST,value="/transactions")
    public void addTransaction(@RequestBody Transaction transaction) {
        transactionService.addTrans(transaction);
    }
}
