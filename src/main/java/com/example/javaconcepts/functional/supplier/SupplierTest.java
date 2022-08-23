package com.example.javaconcepts.functional.supplier;

import java.util.function.Supplier;

public class SupplierTest {

  public static void main(String[] args) {
    Supplier<Integer> supplier = () -> (int) (Math.random() * 1000D);

    System.out.println(supplier.get());
  }

}
