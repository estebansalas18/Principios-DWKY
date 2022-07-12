package DRY;

public class patron {
    private boolean logeado = true;
    private String rol = "admin";

    // Verificar si un usuario es admin
    public boolean esAdmin() {
        return logeado && rol.equals("admin");
    }

    // Metodo para generar un reporte, primero, verificando si el usuario es admin
    public void generarReporte(int reporte) {
        if(esAdmin()) {
            System.out.println("Generando reporte " + reporte);
        }
    }
}
