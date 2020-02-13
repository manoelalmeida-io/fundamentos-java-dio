package one.digitalinnovation.aula03.encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

  private String nome;
  private LocalDate dataNascimento;
  
  public Pessoa(String nome, Integer dia, Integer mes, Integer ano) {
    this.nome = nome;
    this.dataNascimento = LocalDate.of(ano, mes, dia);
  }

  public Integer calculaIdade() {
    return Period.between(dataNascimento, LocalDate.now()).getYears();
  }

  public String getNome() {
    return nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}