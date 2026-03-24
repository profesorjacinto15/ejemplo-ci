package model;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
    private List<Producto> lista;

    public GestionProductos() {
        this.lista = new ArrayList<>();
    }

    public void añadirProducto(String codigo, String nombre, double precio, int stock) {
        lista.add(new Producto(codigo, nombre, precio, stock));
    }

    public void eliminarProducto(int index) {
        if (index>=0 && index<lista.size()) {
            lista.remove(index);
        }
    }

    public List<Producto> getTodos() {
        return new ArrayList<>(lista);
    }

}
