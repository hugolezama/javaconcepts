package com.example.javaconcepts.functional.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

  public static void main(String[] args) {
    Consumer<Integer> consumer = System.out::println;

    consumer.accept(15);

  }

}
