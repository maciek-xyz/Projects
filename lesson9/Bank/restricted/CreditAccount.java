package Lesson8.Bank.restricted;

import Lesson8.Bank.restricted.Account;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    BigDecimal limit;


    public CreditAccount(String number, BigDecimal balance, BigDecimal limit) {
        super(number, balance);
        this.limit = limit;
    }


    @Override
    public BigDecimal withdraw(BigDecimal amount) throws Exception {
        BigDecimal x = BigDecimal.valueOf(-1);
        BigDecimal newLimit = limit.multiply(x);
        BigDecimal newBalance = super.withdraw(amount);
        if (newBalance.compareTo(newLimit) >= 0) {
            return newBalance;
        } else {
            throw new Exception("Error");
        }
    }
}
