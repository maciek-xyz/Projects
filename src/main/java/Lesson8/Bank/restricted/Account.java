package Lesson8.Bank.restricted;

import Lesson8.Bank.BankNotFoundException;
import Lesson8.Bank.NonSufficientFundsException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    private String number;
    private BigDecimal balance;
    private BigDecimal percentage;
    private TransactionHistory transactionHistory;


    public Account(String number, BigDecimal balance) {
        this.number = number;
        this.balance = balance;
        this.transactionHistory = new TransactionHistory(balance);
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

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    protected void addNewTransaction(TransactionType transactionType, LocalDateTime date, BigDecimal currentBalance) {
        transactionHistory.addNewTransaction(transactionType, date, currentBalance);
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
