package one.digitalinnovation.aula02.exemplo1;

public class ExemploInstanciaObjeto {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Manoel");

    System.out.println(pessoa.getNome());
  }
}