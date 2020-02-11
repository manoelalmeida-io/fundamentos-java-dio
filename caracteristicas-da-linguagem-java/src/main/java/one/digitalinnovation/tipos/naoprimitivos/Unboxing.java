package one.digitalinnovation.tipos.naoprimitivos;

@SuppressWarnings({"unused", "deprecation"})
public class Unboxing {

    public static void main(String[] args) {
        // Unboxing: atribuir o valor de um objeto a um tipo primitivo

        int i = new Integer(2); // depreciado desde a versão 9
        int inteiro = Integer.valueOf(1024);

        boolean b = new Boolean(true); // depreciado desde a versão 9
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.valueOf("false");
    }    
}