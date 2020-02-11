package one.digitalinnovation.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234@#$%");

        System.out.printf("Usuário: %s\n", superUsuario.getLogin());
        System.out.printf("Senha: %s\n", superUsuario.getSenha());
    }
}