import Lesson8.Bank.restricted.DebitAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class DebitAccountTest {

    @Test
    public void getBalance_BalanceGreaterThanZero_ReturnBalance() {
        DebitAccount debitAccount = new DebitAccount("2222", BigDecimal.valueOf(40000));
        Assert.assertEquals(BigDecimal.valueOf(40000), debitAccount.getBalance());
    }

    @Test
    public void getBalance_BalanceLessThanZero_ReturnZero() {
        DebitAccount debitAccount = new DebitAccount("2222", BigDecimal.valueOf(-40000));
        Assert.assertEquals(BigDecimal.ZERO, debitAccount.getBalance());
    }
}
