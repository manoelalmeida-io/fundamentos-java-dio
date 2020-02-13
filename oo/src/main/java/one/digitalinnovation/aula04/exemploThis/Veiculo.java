package one.digitalinnovation.aula04.exemploThis;

public class Veiculo {

  private String modelo;
  private String marca;

  private Double valorVenal;

  public Double calculaImposto() {
    return valorVenal * 0.01;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Double getValorVenal() {
    return valorVenal;
  }

  public void setValorVenal(Double valorVenal) {
    this.valorVenal = valorVenal;
  }
}