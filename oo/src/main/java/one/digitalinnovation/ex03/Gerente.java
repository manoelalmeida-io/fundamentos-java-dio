package one.digitalinnovation.ex03;

public class Gerente extends Funcionario{

  @Override
  public Double salarioLiquido() {
    return this.getSalario() - (this.getSalario() * 0.1 / 100);
  }
}