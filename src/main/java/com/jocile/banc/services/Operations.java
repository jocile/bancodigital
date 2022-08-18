package com.jocile.banc.services;

import com.jocile.banc.entities.Account;

public interface Operations {
  void credit(double value);

  void debit(double value);

  void transfer(Double value, Account destinationAccount);

  void printExtract();

  double fullWithdraw();
}
