package one.digitalinnovation.aula03.heranca.exemplo02;

public class Veiculo {

  private String modelo;
  private String marca;

  public void acelera() {
    System.out.println("Acelerando...");
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
}