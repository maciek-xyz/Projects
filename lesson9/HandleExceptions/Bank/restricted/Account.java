package Lesson8.Bank.restricted;

import Lesson8.Bank.BankNotFoundException;
import Lesson8.Bank.NonSufficientFundsException;

import java.math.BigDecimal;

public abstract class Account {
    private String number;
    private BigDecimal balance;
    private BigDecimal percentage;


    public Account(String number, BigDecimal balance) {
        this.number = number;
        this.balance = balance;
    }

    void topUp(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal withDraw(BigDecimal amount) throws Exception {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return balance;
        }else {
            throw new NonSufficientFundsException("Current balance: " + balance);
        }

    }
    public BigDecimal settingPercents(BigDecimal percents) {
        percentage = percents;
        return percentage;
    }

    public BigDecimal applyPercents(){
        return balance = balance.add(balance.multiply(percentage));
    }


    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

     void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", percentage=" + percentage +
                '}';
    }
}
