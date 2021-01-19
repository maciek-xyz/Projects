package Lesson8.Bank;

import Lesson8.Bank.restricted.Account;
import Lesson8.Bank.restricted.Bank;
import Lesson8.Bank.restricted.CreditAccount;
import Lesson8.Bank.restricted.DebitAccount;

import java.math.BigDecimal;

public class BankingApplication {
//    static {
//        initBanking();
//    }

    public static void main(String[] args) throws Exception {
        initBanking();

    }

    private static void initBanking() throws Exception {
        Account accountDebit1 = new DebitAccount("111111", BigDecimal.valueOf(20000));
        Account accountCredit1 = new CreditAccount("222222", BigDecimal.valueOf(40000), BigDecimal.valueOf(100_000));

        Bank mBank = new Bank("mBank",accountDebit1);
        Bank nestBank = new Bank("nestBank",accountCredit1);


        accountCredit1.settingPercents(BigDecimal.valueOf(0.1));
        accountDebit1.settingPercents(BigDecimal.valueOf(0.5));

        accountCredit1.applyPercents();
        accountDebit1.applyPercents();

        //System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());
        //System.out.println(accountDebit1.getNumber());

        ///mBank.topUp("111111", BigDecimal.valueOf(15000));
        nestBank.topUp("222222", BigDecimal.valueOf(14000));

       //System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

        ///mBank.withDraw("111111",BigDecimal.valueOf(5000));
        nestBank.withDraw("222222",BigDecimal.valueOf(10000));

       //System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

       //accountDebit1.withdraw(BigDecimal.valueOf(36000));
        nestBank.withDraw("222222", BigDecimal.valueOf(50000));

       //System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

      //accountDebit1.withdraw(BigDecimal.valueOf(10000));
       nestBank.withDraw("222222", BigDecimal.valueOf(62000));

       //System.out.println(accountDebit1.getBalance());
        System.out.println(accountCredit1.getBalance());

        nestBank.withDraw("222222", BigDecimal.valueOf(50000));
        System.out.println(accountCredit1.getBalance());

       Account account = new DebitAccount(null, BigDecimal.valueOf(432));

       Bank alior = new Bank("Alior", account);


        NationalBank nationalBank = new NationalBank();
        nationalBank.registerBank(mBank);
        nationalBank.registerBank(nestBank);
        System.out.println(nationalBank.banksList);
        //nationalBank.getBankWithBanksList(alior);

        System.out.println(mBank.getAccount(account));
        System.out.println(account);



        // create accounts
        // create banks with accounts
        // register banks in NationalBank
    }
}
