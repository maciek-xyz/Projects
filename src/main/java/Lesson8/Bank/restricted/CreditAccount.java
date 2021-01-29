package Lesson8.Bank.restricted;

import Lesson8.Bank.NonSufficientFundsException;
import Lesson8.Bank.ReachedCreditLimitException;
import Lesson8.Bank.restricted.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditAccount extends Account {
    Account account;
    BigDecimal limit;
    BigDecimal balance1;


    public CreditAccount(String number, BigDecimal balance, BigDecimal limit) {
        super(number, balance);
        this.limit = limit;
    }


    @Override
    public BigDecimal withDraw(BigDecimal amount) throws Exception {
        balance1 = getBalance();
        BigDecimal newLimit = limit.multiply(BigDecimal.valueOf(-1));
        balance1 = balance1.subtract(amount);
        if (balance1.compareTo(newLimit) >= 0) {
            setBalance(balance1);
            addNewTransaction(TransactionType.WITH_DRAW, LocalDateTime.now(), balance1);
            return balance1;
        } else {
            throw new ReachedCreditLimitException("Current balance: " + getBalance() + ", Limit: " + limit);
        }
    }

}


