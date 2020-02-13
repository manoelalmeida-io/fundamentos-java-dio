package one.digitalinnovation.ex03;

public class Programa {

  public static void main(String[] args) {
    
    Gerente gerente = new Gerente();
    gerente.setSalario(5000d);
    System.out.println(gerente.salarioLiquido());

    Supervisor supervisor = new Supervisor();
    supervisor.setSalario(5000d);
    System.out.println(supervisor.salarioLiquido());

    Atendente atendente = new Atendente();
    atendente.setSalario(5000d);  
    System.out.println(atendente.salarioLiquido());
  }
}