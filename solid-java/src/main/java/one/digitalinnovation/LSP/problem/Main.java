package one.digitalinnovation.LSP.problem;

public class Main {

  public static void main(String[] args) {
    Retangulo retangulo = new Quadrado();

    retangulo.setAltura(10d);
    retangulo.setLargura(5d);

    System.out.println("Area: " + retangulo.getArea());
  }
}