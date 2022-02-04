package com.jocile.banc.entities;

import com.jocile.banc.services.Operations;

/**
 * Abstract class that defines the bank generic account
 */
public abstract class Account implements Operations {
  private static final int AGENCY = 1;
  private static int SEQUENCE = 1;
  protected int agency;
  protected int number;
  protected double amount;
  private Client client;

  public Account(String name) {
    this.agency = Account.AGENCY;
    this.number = SEQUENCE++;
    this.client = new Client(name);
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public int getAgency() {
    return this.agency;
  }

  public int getNumber() {
    return this.number;
  }

  public double getAmount() {
    return this.amount;
  }

  @Override
  public void credit(double value) {
    amount += value;
  }

  @Override
  public void debit(double value) {
    if (value < amount) amount -= value;
  }

  @Override
  public void transfer(Double value, Account destinationAccount) {
    this.debit(value);
    destinationAccount.credit(value);
  }

  protected void printInfo() {
    System.out.println("Client: " + this.client.getName());
    System.out.println(String.format("Agency: %d", this.agency));
    System.out.println(String.format("Account: %d", this.number));
    System.out.println(String.format("Amount: %.2f", this.amount));
  }
}
