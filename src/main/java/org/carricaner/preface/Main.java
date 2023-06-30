package org.carricaner.preface;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
  public static void main(String[] args){
    ThreadFactory threadFactory = Executors.defaultThreadFactory();
    threadFactory.newThread(new Printer("Good")).start();
    threadFactory.newThread(new Printer("Nice")).start();
  }
}
