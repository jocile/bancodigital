package com.jocile.banc.entities;

public class Financing {
  private Double totalAmount;
  private Double income;
  private Integer months;

  public Financing(Double totalAmount, Double income, Integer months) {
    validadeFinancing(totalAmount, income, months);
    this.totalAmount = totalAmount;
    this.income = income;
    this.months = months;
  }

  public Double getTotalAmount() {
    validadeFinancing(totalAmount, income, months);
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    validadeFinancing(totalAmount, income, months);
    this.totalAmount = totalAmount;
  }

  public Double getIncome() {
    return income;
  }

  public void setIncome(Double income) {
    validadeFinancing(totalAmount, income, months);
    this.income = income;
  }

  public Integer getMonths() {
    return months;
  }

  public void setMonths(Integer months) {
    validadeFinancing(totalAmount, income, months);
    this.months = months;
  }

  public Double entry() {
    return totalAmount * 0.2;
  }

  public Double quota() {
    return (totalAmount - entry()) / months;
  }

  private void validadeFinancing(
    Double totalAmount,
    Double income,
    Integer months
  ) {
    if (totalAmount == null || totalAmount <= 0) {
      throw new IllegalArgumentException("Total amount must be greater than 0");
    }
    if (income == null || income <= 0) {
      throw new IllegalArgumentException("Income must be greater than 0");
    }
    if (months == null || months <= 0) {
      throw new IllegalArgumentException("Monthly must be greater than 0");
    }
    if (income > totalAmount) {
      throw new IllegalArgumentException(
        "Income must be less than total amount"
      );
    }
    if ((totalAmount * 0.8 / months) > (income / 2.0)) {
      throw new IllegalArgumentException(
        "The monthly Payment cannot be more than half of the income"
      );
    }
  }
}
