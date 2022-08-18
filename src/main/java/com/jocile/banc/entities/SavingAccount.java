package com.jocile.banc.entities;

/**
 * set savings bank account
 */
public class SavingAccount extends Account {
  private Double taxRate = 0.6;

  public SavingAccount(String name) {
    super(name);
  }

  /**
   * interest income credits
   */
  public void yeldInterest() {
    Double yeld = (super.amount * taxRate) / 100;
    credit(yeld);
  }

  public Double getTaxRate() {
    return this.taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  @Override
  public void printExtract() {
    System.out.println("=== Saving Account extract ===");
    super.printInfo();
    System.out.println(
      String.format("interest rate per month: %.2f", this.taxRate)
    );
  }
}
