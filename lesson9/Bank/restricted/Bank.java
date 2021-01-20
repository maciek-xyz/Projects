package Lesson8.Bank.restricted;

import Lesson8.Bank.AccountNotFundException;
import Lesson8.Bank.restricted.Account;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank{
    private String name;
    private Account account;


    public Bank(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void registerAccount(Account account) {
    }

    public void recalculatePercents() {

    }

    public Account getAccount(Account account) throws Exception {
        if (account.getNumber() != null){
            return account;
        } else {
            throw new AccountNotFundException();
        }
    }

    public void topUp(String accountNumber, BigDecimal amount) {
        account.topUp(amount);
    }

    public BigDecimal withDraw(String accountNumber, BigDecimal amount) throws Exception{
        return account.withDraw(amount);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
