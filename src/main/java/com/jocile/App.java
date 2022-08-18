package com.jocile;

import com.jocile.banc.entities.Account;
import com.jocile.banc.entities.SavingAccount;
import com.jocile.banc.services.AccountFactory;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Account cc = AccountFactory.createCurrentAccount("João");
    SavingAccount poup = AccountFactory.createSavingsAccount("Pedro");

    cc.credit(100);

    cc.printExtract();
    poup.printExtract();

    cc.transfer(100.0, poup);

    cc.printExtract();
    poup.printExtract();

    poup.yeldInterest();
    poup.printExtract();
  }
}
