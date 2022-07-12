package DRY;

public class antipatron {
    private boolean logeado = true;
    private String rol = "admin";

    public void generarReporte1() {
        if(logeado = true && rol.equals("admin")) {
            System.out.println("Generando reporte 1");
        }
    }
}
