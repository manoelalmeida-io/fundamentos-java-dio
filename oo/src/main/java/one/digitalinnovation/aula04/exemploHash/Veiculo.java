package one.digitalinnovation.aula04.exemploHash;

import java.util.Objects;

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
  public int hashCode() {
    return Objects.hash(modelo, marca, valorVenal);
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

    if (this.hashCode() == comparavel.hashCode()) {
      return true;
    }

    return false;
  }
}