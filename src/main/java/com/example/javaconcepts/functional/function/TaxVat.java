package com.example.javaconcepts.functional.function;

import java.util.function.Function;

public class TaxVat implements Function<Double, Double> {

  @Override
  public Double apply(Double aLong) {
    return aLong * 1.15;
  }
}
