package com.example.hackerearthcomp;

import com.example.hackerearthcomp.Model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    private ArrayList<Transaction> transactionList = new ArrayList<>(Arrays.asList(
            new Transaction(1234,"credit","INR",3214.0082,4567)
    ));

    public List<Transaction> getTransactionList(){

        Iterable iterable = transactionRepository.findAll();
        Iterator it = iterable.iterator();
        while(it.hasNext())
        {
            Transaction ob = (Transaction) it.next();
            transactionList.add(ob);
        }
        return transactionList;
    }


    public void addTrans(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
