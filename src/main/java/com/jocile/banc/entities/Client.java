package com.jocile.banc.entities;

/**
 * Client implementation
 */
public class Client {
  private String name;

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
