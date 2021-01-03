package Lesson8.Bank;

import java.math.BigDecimal;

public class BankingApplication {
//    static {
//        initBanking();
//    }

    public static void main(String[] args) {
        initBanking();

    }

    private static void initBanking() {
        Account accountDebit1 = new DebitAccount("111111", BigDecimal.valueOf(20000));
        Account accountCredit1 = new CreditAccount("222222", BigDecimal.valueOf(40000), BigDecimal.valueOf(100_000));

        Bank mBank = new Bank("mBank",accountDebit1);
        Bank nestBank = new Bank("nestBank",accountCredit1);

        accountCredit1.settingPercents(BigDecimal.valueOf(0.1));
        accountDebit1.settingPercents(BigDecimal.valueOf(0.5));

        accountCredit1.applyPercents();
        accountDebit1.applyPercents();

        System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());
        System.out.println(accountDebit1.getNumber());

        mBank.topUp("111111", BigDecimal.valueOf(15000));
        nestBank.topUp("222222", BigDecimal.valueOf(14000));

        System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

        mBank.withDraw("111111",BigDecimal.valueOf(5000));
        nestBank.withDraw("222222",BigDecimal.valueOf(10000));

        System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

        accountCredit1.withdraw(BigDecimal.valueOf(40000));
        System.out.println(accountCredit1.getBalance());

        accountCredit1.withdraw(BigDecimal.valueOf(25000));
        System.out.println(accountCredit1.getBalance());

        accountCredit1.withdraw(BigDecimal.valueOf(86000));
        System.out.println(accountCredit1.getBalance());

        accountCredit1.withdraw(BigDecimal.valueOf(14000));
        System.out.println(accountCredit1.getBalance());




        NationalBank nationalBank = new NationalBank();
        nationalBank.registerBank(mBank);
        nationalBank.registerBank(nestBank);
        System.out.println(nationalBank.banksList);

        nationalBank.getByName("nestBank");


        // create accounts
        // create banks with accounts
        // register banks in NationalBank
    }
}
