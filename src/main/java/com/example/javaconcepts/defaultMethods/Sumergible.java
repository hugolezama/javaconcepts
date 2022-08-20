package com.example.javaconcepts.defaultMethods;

public interface Sumergible {

  default void sumergir() {
    System.out.println("Se sumerge");
  }
}
