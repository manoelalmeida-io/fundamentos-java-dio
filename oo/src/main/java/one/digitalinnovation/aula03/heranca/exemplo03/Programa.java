package one.digitalinnovation.aula03.heranca.exemplo03;

public class Programa {

  public static void main(String[] args) {
    
    Veiculo generico = new Veiculo();
    generico.setValorVenal(1000d);
    System.out.println(generico.calculaImposto());

    Carro carro = new Carro();
    carro.setValorVenal(1000d);
    System.out.println(carro.calculaImposto());

    Motocicleta moto = new Motocicleta();
    moto.setValorVenal(1000d);
    System.out.println(moto.calculaImposto());
  }
}