package Lesson8.Bank;

import Lesson8.Bank.restricted.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BankingApplication {
//    static {
//        initBanking();
//    }

    public static void main(String[] args) throws Exception {
        initBanking();

    }

    private static void initBanking() throws Exception {
        Account accountDebit1 = new DebitAccount("111111", BigDecimal.valueOf(20000));
        Account accountCredit1 = new CreditAccount("222222", BigDecimal.valueOf(40000), BigDecimal.valueOf(80_000));

        Bank mBank = new Bank("mBank",accountDebit1);
        Bank nestBank = new Bank("nestBank",accountCredit1);

        TransactionHistory transactionHistoryMBank = new TransactionHistory(BigDecimal.valueOf(20000));
        TransactionHistory transactionHistoryNestBank = new TransactionHistory(BigDecimal.valueOf(40000));

        try {
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

            nestBank.topUp("222222", BigDecimal.valueOf(10000));
            System.out.println(accountCredit1.getBalance());

            Thread.sleep(5000);

            mBank.withDraw("111111", BigDecimal.valueOf(5000));
            nestBank.withDraw("222222", BigDecimal.valueOf(10000));

            System.out.println(accountDebit1.getBalance());
            System.out.println(accountCredit1.getBalance());

            accountDebit1.withDraw(BigDecimal.valueOf(36000));
            nestBank.withDraw("222222", BigDecimal.valueOf(50000));

            System.out.println(accountDebit1.getBalance());
            System.out.println(accountCredit1.getBalance());

//            accountDebit1.withDraw(BigDecimal.valueOf(10000));
//            nestBank.withDraw("222222", BigDecimal.valueOf(62000));
//
//            System.out.println(accountDebit1.getBalance());
//            System.out.println(accountCredit1.getBalance());
//
//            nestBank.withDraw("222222", BigDecimal.valueOf(50000));
//            System.out.println(accountCredit1.getBalance());

            System.out.println("Transaction history for account: 111111");
            accountDebit1.getTransactionHistory().getTransactionFromRange(null, null);
            System.out.println("Transaction history for account: 222222:");
            accountCredit1.getTransactionHistory().getTransactionFromRange(null, null);
            System.out.println("Transaction history for account: 111111 (23.01.2021 12:13)");
            accountDebit1.getTransactionHistory().getTransactionFromRange(LocalDateTime.of(2021,1,23,12,13), null);

        } catch (BankNotFoundException | NonSufficientFundsException | AccountNotFundException | ReachedCreditLimitException e) {
            System.out.println(e.getClass());
        }



        // create accounts
        // create banks with accounts
        // register banks in NationalBank
    }
}
