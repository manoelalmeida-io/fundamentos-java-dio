package one.digitalinnovation.ex01;

public class Carro {

  Integer qtdPessoas = 1;

  public String getQtdPessoas() {

    String quantidade = qtdPessoas.toString();
    Integer tamanho = quantidade.length();

    while (tamanho < 3) {
      quantidade += " ";
      tamanho = quantidade.length();
    }

    return quantidade;
  }

  public void entrar() {
    qtdPessoas++;
  }

  public void sair() {
    qtdPessoas--;
  }
}