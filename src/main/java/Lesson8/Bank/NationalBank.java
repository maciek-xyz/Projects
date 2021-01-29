package Lesson8.Bank;

import Lesson8.Bank.restricted.Bank;

import java.util.ArrayList;
import java.util.List;

public class NationalBank {
    private Bank bank;

    List<Bank> banksList = new ArrayList<>();

    void registerBank(Bank bank) {
        banksList.add(bank);
    }


    public Bank getBankWithBanksList(Bank bank) throws BankNotFoundException {
        if(banksList.contains(bank)) {
            return bank;
        } else {
            throw new BankNotFoundException();
        }
    }

}
