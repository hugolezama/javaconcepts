package com.example.javaconcepts.functional.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Hugo", null, "Cesar");
    System.out.println(names);
    System.out.println("Filtered: " + names.stream().filter(new CheckForNull()).collect(Collectors.toList()));
  }

}
