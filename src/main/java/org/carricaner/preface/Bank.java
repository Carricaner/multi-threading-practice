package org.carricaner.preface;

import java.util.UUID;

public class Bank {
  private final String ID = UUID.randomUUID().toString();
  private int money;

  public Bank(int money) {
    this.money = money;
  }

  public synchronized void deposit(int amount) {
    money += amount;
  }

  public synchronized boolean withdraw(int amount) {
    if (money >= amount) {
      money -= amount;
      return true;
    } else {
      return false;
    }
  }
}
