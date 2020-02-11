package one.digitalinnovation.tipos.tipagem;

@SuppressWarnings("unused")
public class TipagemForte {

    public static void main(String[] args) {
        
        String texto = "meu texto";

        //texto = 1000; // erro

        Integer numero = Integer.valueOf(1024);

        numero = 512; // ok
    }
}