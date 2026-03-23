package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
    private List<Producto> lista;

    public GestionProductos() {
        this.lista = new ArrayList<>();
    }

    public void añadirProducto(String id, String nombre, int cantidad) {
        lista.add(new Producto(id,nombre,cantidad));
    }

    public boolean eliminarProducto(Producto producto) {
       for(Producto produ: lista) {
           if (produ.getId().equals(producto.getId()))
               lista.remove(producto)
               return true;
       }
       return false;
    }

    public List<Producto> getTodos() {
        return new ArrayList<>(lista);
    }

}
