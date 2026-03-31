package com.infozaid.floatprecision;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = new BigDecimal(0);

    public Account() {
    }

    public void deposit(BigDecimal amount){
        this.balance  = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount){
        if(this.balance.compareTo(amount)>0){
            this.balance  = this.balance.subtract(amount);
        }
    }

    public String getBalanceString(){
        return balance.toString();
    }
}
