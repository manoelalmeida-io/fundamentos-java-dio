package one.digitalinnovation.OCP.solution;

public class DescontoLivroInfantil implements DescontoLivro {

  @Override
  public Double valorDesconto() {
    return 0.3;
  }
}