package com.example.javaconcepts.immutable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ImmutableClassTest {

  public static void main(String[] args) {
    Set<String> hobbies = new HashSet<>(Arrays.asList("Play", "Sleep"));
    ImmutableClass immutableClass = new ImmutableClass(1, "Hugo", hobbies);

    System.out.println("Name: " + immutableClass.getName());
    System.out.println("Age: " + immutableClass.getAge());
    System.out.println("Hobbies: " + immutableClass.getHobbies());

    hobbies.add("Clean");
    // Should not include "Clean"
    System.out.println("Hobbies: " + immutableClass.getHobbies());

    hobbies = immutableClass.getHobbies();
    hobbies.add("Workout");
    // Should not include "Workout"
    System.out.println("Hobbies: " + immutableClass.getHobbies());
  }
}
