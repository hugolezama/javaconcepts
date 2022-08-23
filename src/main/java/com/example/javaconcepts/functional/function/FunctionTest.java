package com.example.javaconcepts.functional.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

  public static void main(String[] args) {
    Function<String, String> functionExample = (name) -> "Hello " + name;

    System.out.println(functionExample.apply("Hugo"));

    Function<Double, Double> taxVat = new TaxVat();
    System.out.println("1200 + Tax = " + taxVat.apply(1200D));

    System.out.println("Double of 15 = " + duplicate(15, aDouble -> aDouble * 2));
    System.out.println("Double of 10 = " + duplicate(10, aDouble -> aDouble * 2));

    List<Double> quantities = Arrays.asList(1200D, 1550D, 2150.50);

    System.out.println(quantities.stream().map(new TaxVat()).collect(Collectors.toList()));

  }

  static long duplicate(long v, Function<Long, Long> lambda) {
    return lambda.apply(v);
  }
}
