package one.digitalinnovation.aula03.heranca.exemplo03;

public class Motocicleta extends Veiculo {

  private String cilindradas;

  public Double calculaImposto() {
    return this.getValorVenal() * 0.03;
  }

  public String getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(String cilindradas) {
    this.cilindradas = cilindradas;
  }
}