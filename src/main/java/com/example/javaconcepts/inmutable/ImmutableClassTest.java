package com.example.javaconcepts.inmutable;

import java.util.Arrays;

public class ImmutableClassTest {

  public static void main(String[] args) {
    ImmutableClass immutableClass = new ImmutableClass(1, "Hugo", Arrays.asList("Play", "Sleep"));

System.out.println("Name: "+immutableClass.getName());
System.out.println("Age: "+immutableClass.getAge());
System.out.println("Hobbies: "+immutableClass.getName());
  }
}
