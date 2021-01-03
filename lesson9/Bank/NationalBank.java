package Lesson8.Bank;

import java.util.ArrayList;
import java.util.List;

public class NationalBank {

    List<String> banksList = new ArrayList<>();

    void registerBank(Bank bank) {
        banksList.add(bank.getName());
    }

    Bank getByName(String bankName) {
        System.out.println(bankName);
        return null;
    }
}
