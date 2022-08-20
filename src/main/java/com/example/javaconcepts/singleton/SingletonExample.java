package com.example.javaconcepts.singleton;

public final class SingletonExample {

  private int counter = 0;

  private static SingletonExample instance;

  private SingletonExample() {
  }

  public static SingletonExample getIntstance() {
    instance = instance != null ? instance : new SingletonExample();
    return instance;
  }

  public int getCounter() {
    return counter;
  }

  public void incrementCounter() {
    this.counter++;
  }

}
