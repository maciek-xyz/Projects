import Lesson8.Bank.AccountNotFundException;
import Lesson8.Bank.restricted.Bank;
import Lesson8.Bank.restricted.DebitAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BankTest {

    @Test
    public void getAccount_notNumberAccount_throwsAccountNotFundException(){
        DebitAccount debitAccount = new DebitAccount(null, BigDecimal.valueOf(25000));
        Bank bank = new Bank("mBank",debitAccount);
        Assert.assertThrows(AccountNotFundException.class, () -> bank.getAccount(debitAccount));
    }
}
