package com.example.javaconcepts.singleton;

public class TestSingleton {

  public static void main(String[] args) {
    SingletonExample instance1 = SingletonExample.getIntstance();

    instance1.incrementCounter();
    System.out.println(instance1.getCounter());

    SingletonExample instance2 = instance1;
    instance2.incrementCounter();
    SingletonExample instance3 = SingletonExample.getIntstance();
    instance3.incrementCounter();

    System.out.println(instance1.getCounter());
    System.out.println(instance3.getCounter());

  }
}
