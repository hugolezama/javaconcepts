package com.example.javaconcepts.functional;

public class FITest {

  public static void main(String[] args) {
    FunctionalInterface1 lambda = () -> System.out.println("Executing Lambda");

    lambda.execute();
  }
}
