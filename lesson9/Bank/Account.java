package Lesson8.Bank;

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

    BigDecimal withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        return balance;
    }
    BigDecimal settingPercents(BigDecimal percents) {
        percentage = percents;
        return percentage;
    }

    BigDecimal applyPercents(){
        return balance = balance.add(balance.multiply(percentage));
    }

//    BigDecimal getMoney(BigDecimal amount){
//        return null;
//    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }
}
