package Lesson8.Bank.restricted;


import Lesson8.Bank.restricted.Account;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(String number, BigDecimal balance) {
        super(number, balance);
    }


    @Override
    public BigDecimal getBalance() {
        if (super.getBalance().compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }
        return super.getBalance();
    }

    @Override
    public BigDecimal applyPercents() {
        return super.applyPercents();
    }

}
