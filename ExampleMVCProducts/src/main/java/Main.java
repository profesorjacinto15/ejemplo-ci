import controlador.ControladorProductos;
import modelo.GestionProductos;
import vista.VentanaProductos;

public class Main {

    public static void main(String[] args) {

        // Creamos el modelo
        GestionProductos modelo = new GestionProductos();

        // Creamos la vista
        VentanaProductos vista = new VentanaProductos();

        // Controlador que vincula la vista y el modelo
        new ControladorProductos(modelo, vista);

        vista.setVisible(true);
    }

}
