package one.digitalinnovation.ex03;

public class Supervisor extends Funcionario {

  @Override
  public Double salarioLiquido() {
    return this.getSalario() - (this.getSalario() * 0.05 / 100);
  }
}