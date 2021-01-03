package Lesson8.Bank;

import java.math.BigDecimal;

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

    public void registerAccount() {
    }

    public void recalculatePercents() {

    }

    public void topUp(String accountNumber, BigDecimal amount) {
        account.topUp(amount);
    }

    public BigDecimal withDraw(String accountNumber, BigDecimal amount){
        return account.withdraw(amount);
    }
}
