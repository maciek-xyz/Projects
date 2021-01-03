package Lesson8.Bank;


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
    BigDecimal applyPercents() {
        return super.applyPercents();
    }

//    @Override
//    void applyPercents() {
//
//        super.applyPercents();
//        if (getBalance().compareTo(BigDecimal.ZERO) <= 0) {
//            super.getBalance();
//            System.out.println("Current funds on the account: " + getBalance() + " zł.");
//        } else {
//            System.out.println("Current funds on the account: " + getBalance() + " zł.");
//        }
//
//    }
}
