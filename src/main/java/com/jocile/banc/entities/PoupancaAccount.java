package com.jocile.banc.entities;

/**
 * set poupança savings bank account
 */
public class PoupancaAccount extends Account {
  private Double taxRate = 0.6;

  public PoupancaAccount(String name) {
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
    System.out.println("=== Saving Poupanca Account extract ===");
    super.printInfo();
    System.out.println(
      String.format("interest rate per month: %.2f", this.taxRate)
    );
  }
}
