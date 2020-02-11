package one.digitalinnovation.tipos.primitivos;

public class DefaultValues {

    public static void main(String[] args) {
        
        final Default d = new Default();

        System.out.println(d.getI());
        System.out.println(d.getActive());
    }
}

class Default {

    private int i;
    private boolean active;

    public int getI() {
        return i;
    }

    public boolean getActive() {
        return active;
    }
}