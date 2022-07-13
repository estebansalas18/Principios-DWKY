package KISS;

public class principio {
    private String abecedario = "abcdefghijklmnopqrstuvwxyz";

    // Metodo para obtener una letra del abecedario segun su posicion
    public char abecedario(int i) {
        if(i < 0 || i > 26) 
            throw new UnsupportedOperationException();
        return abecedario.charAt(i - 1);
    }
}
