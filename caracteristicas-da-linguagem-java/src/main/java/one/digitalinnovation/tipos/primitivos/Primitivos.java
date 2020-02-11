package one.digitalinnovation.tipos.primitivos;

@SuppressWarnings("unused")
public class Primitivos {

    public static void main(String[] args) {
        
        /*byte nullByte = null; Não é possível atribuir null para um tipo primitivo*/

        /* byte = 8bits */
        byte b;         
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129; // Muito grande

        /* char = 16bits */
        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA';
        //char c4 = -100;

        /* short = 16bits */
        short s;
        short s1 = 32767;
        short s2 = -32768;

        /* int = 32bits */
        int i;
        int i1 = 2147483647;
        int i2 = -2147483648;
        //int i3 = 2147483649 // Muito grande;

        /* long = 64bits */
        long l;
        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;
        //long l3 = 9223372036854775808L // Muito grande;

        /* float = 32bits */
        float f;
        float f1 = 65f;
        float f2 = 65.0f;
        float f3 = -0.5f;

        /* double = 64bits */
        double d;
        double d1 = 1024.99;
        double d2 = 10.2456;

        /* boolean 1bit */
        boolean bo;
        boolean bo1 = true;
        boolean bo2 = false;
        //boolean bo3 = "false"; // não booleano
        //boolean bo4 = "true"; // não booleano

        //void v; // palavra reservada | não é um tipo
    }
}