package com.example.javaconcepts.defaultMethods;

public interface Rastreador extends Sumergible {

  default void rastrear() {
    sumergir();
    System.out.println("Rastrea");
  }
}
