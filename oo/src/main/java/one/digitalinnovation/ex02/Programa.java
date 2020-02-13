package one.digitalinnovation.ex02;

import java.util.ArrayList;

public class Programa {

  public static void main(String[] args) {
    
    var carros = new ArrayList<Carro>();

    carros.add(new Carro());
    carros.add(new Carro("Ford", "Fiesta", 2020));
    carros.add(new Carro("Ford", "Palio", 2020, "Weekend"));

    carros.forEach(carro -> {
      System.out.println(String.format("Marca: %s", carro.getMarca()));
      System.out.println(String.format("Modelo: %s", carro.getModelo()));
      System.out.println(String.format("Ano: %s", carro.getAno()));
      System.out.println(String.format("Variante: %s", carro.getVariante()));
      System.out.println("=====================================");
    });
  }
}