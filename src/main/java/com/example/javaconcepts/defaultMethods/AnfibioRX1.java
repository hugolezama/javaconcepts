package com.example.javaconcepts.defaultMethods;

public class AnfibioRX1 extends Vehiculo implements Rastreador {

  @Override
  public void sumergir() {
    System.out.println("Anfibio se sumerge");
  }

  public static void main(String[] args) {

    AnfibioRX1 anfibioRX1 = new AnfibioRX1();
    anfibioRX1.conducir();
    anfibioRX1.rastrear();
    anfibioRX1.sumergir();
  }

}
