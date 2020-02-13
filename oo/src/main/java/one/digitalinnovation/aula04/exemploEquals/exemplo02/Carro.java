package one.digitalinnovation.aula04.exemploEquals.exemplo02;

public class Carro extends Veiculo{

  private Integer quantidadeDePortas;

  public Carro(String modelo, String marca, Double valorVenal) {
    super(modelo, marca, valorVenal);
  }

  public Carro(String modelo, String marca, Double valorVenal, Integer quantidadeDePortas) {
    super(modelo, marca, valorVenal);
    this.quantidadeDePortas = quantidadeDePortas;
  }

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