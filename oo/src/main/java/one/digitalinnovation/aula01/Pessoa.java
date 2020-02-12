package one.digitalinnovation.aula01;

public class Pessoa {

	private String nome = "Manoel";

	public String getNome() {
		return nome;
	}

	public String falarMeuProprioNome() {
		return "Olá, meu nome é " + nome;
	}

	public String andar() {
		return "Andando...";
	}
}