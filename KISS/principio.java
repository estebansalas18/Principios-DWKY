package KISS;

public class patron {
    private String abecedario = "abcdefghijklmnopqrstuvwxyz";

    // Metodo para obtener una letra del abecedario segun su posicion
    public char abecedario(int i) {
        return abecedario.charAt(i - 1);
    }
}
