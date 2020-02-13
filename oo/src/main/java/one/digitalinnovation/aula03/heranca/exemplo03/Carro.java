package one.digitalinnovation.aula03.heranca.exemplo03;

public class Carro extends Veiculo{

  private Integer quantidadeDePortas;

  public Double calculaImposto() {
    return this.getValorVenal() * 0.07;
  }

  public Integer getQuantidadeDePortas() {
    return quantidadeDePortas;
  }

  public void setQuantidadeDePortas(Integer quantidadeDePortas) {
    this.quantidadeDePortas = quantidadeDePortas;
  }
}