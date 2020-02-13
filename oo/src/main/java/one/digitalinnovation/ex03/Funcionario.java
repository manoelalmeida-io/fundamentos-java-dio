package one.digitalinnovation.ex03;

public class Funcionario {

  private String nome;
  private Double salario;

  public Double salarioLiquido() {
    return salario - (salario * 0 / 100);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }
}