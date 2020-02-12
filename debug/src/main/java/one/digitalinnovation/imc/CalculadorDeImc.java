package one.digitalinnovation.imc;

import one.digitalinnovation.pessoa.Pessoa;

public class CalculadorDeImc {

  public Double calcula(final Pessoa pessoa) {
    final var altura = pessoa.getAltura();
    final var imc = pessoa.getPeso() / altura * altura;

    return imc;
  }
}