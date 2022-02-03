package com.jocile.banc.entities;

import java.util.List;

/**
 * banc specific
 */
public class Banc {
  private String name;
  private List<Account> accounts;

  public String getName() {
    return this.name;
  }

  public List<Account> getAccounts() {
    return this.accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account searcAccount(int number) {
    int i = 0;
    boolean found = false;
    Account resposta = null;
    while ((!found) && (i < accounts.size())) {
      if (accounts.get(i).getNumber() == (number)) {
        found = true;
      } else {
        i = i + 1;
      }
    }
    if (found) resposta = accounts.get(i);
    return resposta;
  }
}
