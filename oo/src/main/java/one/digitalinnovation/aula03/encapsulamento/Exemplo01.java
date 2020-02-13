package one.digitalinnovation.aula03.encapsulamento;

public class Exemplo01 {

  public static void main(String[] args) {
    Pessoa eu = new Pessoa("Manoel", 28, 11, 2000);

    System.out.println(eu.getNome());
    System.out.println(eu.getDataNascimento());
    System.out.println(eu.calculaIdade());

    eu.setNome("Manoel Almeida");

    System.out.println(eu.getNome());
  }
}