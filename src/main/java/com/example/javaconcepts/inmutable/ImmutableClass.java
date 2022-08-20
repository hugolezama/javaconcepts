package com.example.javaconcepts.inmutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

  private final int age;
  private final String name;
  private final List<String> hobbies;


  public ImmutableClass(int age, String name, List<String> hobbies) {
    this.age = age;
    this.name = name;
    // Assign a copy to avoid referring to the same object
    this.hobbies = new ArrayList<>(hobbies);
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public List<String> getHobbies() {
    // Return a copy instead of a reference to original list to make it immutable
    return new ArrayList<>(hobbies);
  }


}
