package Lesson8.Bank.restricted;

import Lesson8.Bank.NonSufficientFundsException;
import Lesson8.Bank.ReachedCreditLimitException;
import Lesson8.Bank.restricted.Account;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    Account account;
    BigDecimal limit;


    public CreditAccount(String number, BigDecimal balance, BigDecimal limit) {
        super(number, balance);
        this.limit = limit;
    }


    @Override
    public BigDecimal withDraw(BigDecimal amount) throws Exception {
        BigDecimal x = BigDecimal.valueOf(-1);
        BigDecimal newLimit = limit.multiply(x);
        BigDecimal newBalance = getBalance().subtract(amount);
        if (newBalance.compareTo(newLimit) >= 0) {
            return newBalance;
        } else {
            throw new ReachedCreditLimitException("Current balance: " + getBalance() + ", Limit: " + limit);
        }
    }
}


