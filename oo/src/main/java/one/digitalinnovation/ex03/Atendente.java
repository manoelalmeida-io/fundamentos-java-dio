package one.digitalinnovation.ex03;

public class Atendente extends Funcionario {

  @Override
  public Double salarioLiquido() {
    return this.getSalario() - (this.getSalario() * 0.01 / 100);
  }
}