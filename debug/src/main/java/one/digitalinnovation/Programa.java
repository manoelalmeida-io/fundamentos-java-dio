package one.digitalinnovation;

import one.digitalinnovation.imc.CalculadorDeImc;
import one.digitalinnovation.pessoa.Pessoa;

public class Programa {

  public static void main(String[] args) {
    final Pessoa pessoa = new Pessoa("Manoel", 1.75, 54d);

    final var calculadorDeImc = new CalculadorDeImc();
    final var imc = calculadorDeImc.calcula(pessoa);

    System.out.printf("IMC = %.2f", imc);
  }
}