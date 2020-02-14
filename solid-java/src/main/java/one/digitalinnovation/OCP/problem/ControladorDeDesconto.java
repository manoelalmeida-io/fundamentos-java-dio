package one.digitalinnovation.OCP.problem;

public class ControladorDeDesconto {

  public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
    descontoLivroInfantil.valorDescontoLivroInfantil();
  }

  public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
    descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
  }

  // adicionando desconto diretamente na classe
  public void adicionaDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao) {
    descontoLivroAcao.valorDescontoLivroAcao();
  }
}