package org.carricaner.preface;

public class Printer implements Runnable {
  private final String message;
  public Printer(String message) {
    this.message = message;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print(message);
    }
  }
}
