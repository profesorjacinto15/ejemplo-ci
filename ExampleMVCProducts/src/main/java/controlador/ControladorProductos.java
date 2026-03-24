package controlador;

import modelo.GestionProductos;
import modelo.Producto;
import vista.VentanaProductos;

import javax.swing.*;

public class ControladorProductos {
    private VentanaProductos vista;
    private GestionProductos modelo;

    public ControladorProductos(GestionProductos modelo, VentanaProductos vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.btnAdd.addActionListener(e -> agregarProducto());
        this.vista.btnDel.addActionListener(e-> eliminarProducto());
    }

    private void agregarProducto() {
        if (!vista.txid.getText().isEmpty()) {
            if (!vista.txnombre.getText().isEmpty()) {
                if (!vista.txtcantidad.getText().isEmpty()) {
                    modelo.añadirProducto(vista.txid.getText(), vista.txnombre.getText(), Integer.parseInt(vista.txtcantidad.getText()));
                    actualizarListaEnVista();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad no puede estar en blanco");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nombre no puede estar en blanco");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Id no puede estar en blanco");
        }

    }

    private void eliminarProducto() {
        int index = vista.listaProductos.getSelectedIndex();
        if (index!=-1) {
            modelo.eliminarProducto(index);
            actualizarListaEnVista();
        }
    }

    private void actualizarListaEnVista() {
        vista.modeloProducto.clear();
        for(Producto produ: modelo.getTodos()) {
            vista.modeloProducto.addElement(produ);
        }
    }

    private void limpiarCampos() {
        vista.txid.setText("");
        vista.txnombre.setText("");
        vista.txtcantidad.setText("");
    }

}
