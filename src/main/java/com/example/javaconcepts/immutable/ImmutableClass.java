package com.example.javaconcepts.immutable;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {

  private final int age;
  private final String name;
  private final Set<String> hobbies;


  public ImmutableClass(int age, String name, Set<String> hobbies) {
    this.age = age;
    this.name = name;
    // Assign a copy to avoid referring to the same object
    this.hobbies = new HashSet<>(hobbies);
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public Set<String> getHobbies() {
    // Return a copy instead of a reference to original list to make it immutable
    return new HashSet<>(hobbies);
  }


}
