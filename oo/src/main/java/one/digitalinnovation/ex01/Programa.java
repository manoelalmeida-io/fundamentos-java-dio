package one.digitalinnovation.ex01;

import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {

    Integer tecla;
    var carro = new Carro();

    var leitor = new Scanner(System.in);

    do {
      System.out.println(" _________________________ ");
      System.out.println("|                         |");
      System.out.println("| Programa carro          |");
      System.out.println("|-------------------------|");
  
      System.out.printf("| Pessoas no carro: %s   |\n", carro.getQtdPessoas());
  
      System.out.println("|-------------------------|");
      System.out.println("| Entrar (1)              |");
      System.out.println("| Sair (2)                |");
      System.out.println("|-------------------------|");
      System.out.println("| Sair do programa (0)    |");
      System.out.println("|_________________________|");
      
      tecla = leitor.nextInt();

      if (tecla == 1) {
        carro.entrar();
      } else if (tecla == 2) {
        carro.sair();
      }

    } while (tecla != 0);

    leitor.close();
  }
}