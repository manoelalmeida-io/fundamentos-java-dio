package one.digitalinnovation.aula04.exemploEquals.exemplo02;

public abstract class Veiculo {

  private String modelo;
  private String marca;

  private Double valorVenal;

  public Veiculo(String modelo, String marca, Double valorVenal) {
    this.modelo = modelo;
    this.marca = marca;
    this.valorVenal = valorVenal;
  }

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

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    Veiculo comparavel;
    if (obj instanceof Veiculo) {
      comparavel = (Veiculo)obj;
    } else {
      return false;
    }

    if (comparavel.marca.equals(this.marca) && comparavel.modelo.equals(this.modelo) && comparavel.valorVenal.equals(this.valorVenal)) {
      return true;
    }

    return false;
  }
}