package com.jocile;

import com.jocile.banc.entities.Account;
import com.jocile.banc.entities.CurrentAccount;
import com.jocile.banc.entities.PoupancaAccount;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Account cc = new CurrentAccount("João");
    PoupancaAccount poup = new PoupancaAccount("Pedro");

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
