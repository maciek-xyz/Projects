package Lesson8.Bank;

import Lesson9.BoxesAndShelves.Box;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    BigDecimal limit;


    public CreditAccount(String number, BigDecimal balance, BigDecimal limit) {
        super(number, balance);
        this.limit = limit;
    }


    @Override
    BigDecimal withdraw(BigDecimal amount) {
        BigDecimal x = BigDecimal.valueOf(-1);
        BigDecimal newLimit = limit.multiply(x);
        super.withdraw(amount);
        if (super.getBalance().compareTo(newLimit) == -1) {
            return null;
        } else {
            return super.getBalance();
        }
    }
}
