package com.example.javaconcepts.functional.operators;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorsTest {

  public static void main(String[] args) {
    // UNARY OPERATOR
    UnaryOperator<Person> unaryOperator =
        (person) -> {
          person.name = "New Name";
          return person;
        };

    Person p1 = new Person("Hugo", 37);
    Person p2 = unaryOperator.apply(p1);
    System.out.println(p2);

    // BINARY OPERATOR

    BinaryOperator<Integer> multiplier =
        (value1, value2) -> value1 * value2;

    System.out.println(multiplier.apply(5, 7));
  }


  static class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }
  }
}
