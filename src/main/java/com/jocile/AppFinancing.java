package com.jocile;

import com.jocile.banc.entities.Financing;

public class AppFinancing {

  public static void main(String[] args) {
    try {
      Financing f1 = new Financing(100000.0, 2000.0, 20);
      System.out.println("Financing data 1: ");
      System.out.printf("Entry: %.2f%n", f1.entry());
      System.out.printf("Monthly Payment: %.2f%n", f1.quota());
    } catch (IllegalArgumentException e) {
      System.out.println("Financing error 1: " + e.getMessage());
    }

    try {
      Financing f2 = new Financing(10000.0, 2000.0, 80);
      System.out.println("Financing data 2: ");
      System.out.printf("Entry: %.2f%n", f2.entry());
      System.out.printf("Monthly Payment: %.2f%n", f2.quota());
    } catch (IllegalArgumentException e) {
      System.out.println("Financing error 1: " + e.getMessage());
    }
  }
}
