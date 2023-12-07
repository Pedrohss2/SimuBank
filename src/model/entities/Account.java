package model.entities;

import model.exceptions.ErrorsAccountException;

public class Account {
    private Integer numberAccount;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer numberAccount, String holder, Double balance, Double withdrawLimit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.withdrawLimit += amount;
    }

    public void withdraw(Double amount) throws ErrorsAccountException {
        if(amount > withdrawLimit) {
            throw new ErrorsAccountException("Withdraw error: The amount exceeds withdraw limit!");
        }
        if(withdrawLimit > balance) {
            throw new ErrorsAccountException("Withdraw error: not enough balance! ");
        }

        this.balance -= amount;
    }


    @Override
    public String toString() {
        return  String.format("%.2f", balance);
    }

}