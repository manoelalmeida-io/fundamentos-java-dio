package one.digitalinnovation.LSP.problem;

public class Retangulo {

  private Double altura;
  private Double largura;

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public Double getLargura() {
    return largura;
  }

  public void setLargura(Double largura) {
    this.largura = largura;
  }

  public Double getArea() {
    return altura * largura;
  }
}