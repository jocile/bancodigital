package com.jocile.banc.services;

import com.jocile.banc.entities.CurrentAccount;
import com.jocile.banc.entities.SavingAccount;

public class AccountFactory {

  public static CurrentAccount createCurrentAccount(String name) {
    return new CurrentAccount(name);
  }

  public static SavingAccount createSavingsAccount(String name) {
    return new SavingAccount(name);
  }
}
