package com.example.javaconcepts.functional;

public interface FunctionalInterface2 {

  void execute();

  default void defaultMethod() {
    System.out.println("Default Method");
  }

  static void print(String name) {
    System.out.println("Hello " + name);
  }
}
