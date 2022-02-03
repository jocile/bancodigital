package com.jocile.banc.entities;

/**
 * set current bank account
 */
public class CurrentAccount extends Account {

  public CurrentAccount(String name) {
    super(name);
  }

  @Override
  public void printExtract() {
    System.out.println("=== Current account extract ===");
    super.printInfo();
  }
}
