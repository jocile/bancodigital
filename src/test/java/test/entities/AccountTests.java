package test.entities;

import com.jocile.banc.entities.Account;
import com.jocile.banc.services.AccountFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

  @Test
  public void depositShouldIncreaseBalanceWhenPositiveAmount() {
    double amount = 200.0;
    double expectedBalance = 200.0;

    Account cc = AccountFactory.createCurrentAccount("João");
    cc.credit(amount);

    Assertions.assertEquals(expectedBalance, cc.getAmount());
  }

  @Test
  public void depositShouldDoNothingWhenNegativeAmount() {
    double expectedBalance = 100.0;

    Account cc = AccountFactory.createCurrentAccount("Pedro");
    cc.credit(100.0);
    cc.debit(200.0);

    Assertions.assertEquals(expectedBalance, cc.getAmount());
  }
}
