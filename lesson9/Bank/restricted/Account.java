package Lesson8.Bank.restricted;

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

    public BigDecimal withdraw(BigDecimal amount) throws Exception {
            balance = balance.subtract(amount);
            return balance;
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

    public BigDecimal getPercentage() {
        return percentage;
    }
}
