package com.example.hackerearthcomp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    private int accno;
    private String type;
    private String currency;
    private double amount;
    private int senderacc;

    public Transaction()
    {

    }

    public Transaction(int accno, String type, String currency, double amount, int senderacc) {
        this.accno = accno;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.senderacc = senderacc;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSenderacc(int senderacc) {
        this.senderacc = senderacc;
    }

    public int getAccno() {
        return accno;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public int getSenderacc() {
        return senderacc;
    }
}
