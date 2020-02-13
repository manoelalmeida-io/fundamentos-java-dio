package one.digitalinnovation.aula03.heranca.exemplo01;

public class Programa {

  public static void main(String[] args) {
    
    Carro carro = new Carro();
    carro.setMarca("Nissan");
    carro.setModelo("March");
    carro.setQuantidadeDePortas(4);

    Motocicleta moto = new Motocicleta();
    moto.setMarca("Ducati");
    moto.setModelo("Streetfighter");
    moto.setCilindradas("850");
  }  
}