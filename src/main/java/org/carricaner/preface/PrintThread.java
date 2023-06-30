package org.carricaner.preface;

public class PrintThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print("{}");
      try {
        sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
