package com.infozaid.floatprecision;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(new BigDecimal("1000.00"));

        account.withdraw(new BigDecimal("100.00"));

        System.out.println(account.getBalanceString());
    }
}
