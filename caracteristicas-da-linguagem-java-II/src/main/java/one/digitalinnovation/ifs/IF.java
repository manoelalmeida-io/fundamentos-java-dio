package one.digitalinnovation.ifs;

public class IF {

	public static void main(String[] args) {

		final var condicao = true;

		if (condicao) {
			System.out.println("A condição é verdadeira");
		} else {
			System.out.println("A condição é falsa");
		}

		if (condicao) {
			System.out.println("Uma unica linha...");
		}

		final var ternario = condicao ? "é verdadeira" : "é falsa";
		System.out.println(ternario);
	}
}