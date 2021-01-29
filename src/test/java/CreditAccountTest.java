import Lesson8.Bank.ReachedCreditLimitException;
import Lesson8.Bank.restricted.CreditAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditAccountTest {

    @Test
    public void withDraw_BalanceGreaterThanLimit_ReturnBalance() throws Exception {
        CreditAccount creditAccount = new CreditAccount("2222", BigDecimal.valueOf(40000),BigDecimal.valueOf(20000));
        creditAccount.withDraw(BigDecimal.valueOf(45000));
        Assert.assertEquals(BigDecimal.valueOf(-5000),creditAccount.getBalance());
    }

    @Test
    public void withDraw_balanceLessThanLimit_throwsReachedCreditLimitException() throws Exception {
        CreditAccount creditAccount = new CreditAccount("22", BigDecimal.valueOf(40000),BigDecimal.valueOf(20000));
        creditAccount.withDraw(BigDecimal.valueOf(45000));
        Assert.assertThrows(ReachedCreditLimitException.class,() -> creditAccount.withDraw(BigDecimal.valueOf(30000)) );


    }
}
