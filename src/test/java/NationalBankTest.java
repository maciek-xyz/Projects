import Lesson8.Bank.BankNotFoundException;
import Lesson8.Bank.NationalBank;
import Lesson8.Bank.restricted.Bank;
import Lesson8.Bank.restricted.DebitAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NationalBankTest {

    @Test
    public void getBankwithBanksList_banksListNotContainsBank_throwsBankNotFoundException(){
        NationalBank nationalBank = new NationalBank();
        Bank bank = new Bank("mBank",new DebitAccount("222", BigDecimal.valueOf(25000)));
        Assert.assertThrows(BankNotFoundException.class, () -> nationalBank.getBankWithBanksList(bank));
    }
}
