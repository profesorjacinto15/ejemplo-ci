package vista;

import modelo.Producto;

import javax.swing.*;
import java.awt.*;

public class VentanaProductos extends JFrame {

    public JTextField txid = new JTextField(20);
    public JTextField txnombre = new JTextField(20);
    public JTextField txtcantidad = new JTextField(10);

    public JButton btnAdd = new JButton("Agregar");

    public JButton btnDel = new JButton("Eliminar");

    public DefaultListModel<Producto> modeloProducto = new DefaultListModel<>();

    public JList<Producto> listaProductos = new JList<>(modeloProducto);

    public VentanaProductos() {
         setTitle("Productos");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(new BorderLayout());

         // Creamos un panel
        JPanel panelsup = new JPanel(new GridLayout(3,2));
        panelsup.add(new JLabel("Id:"));
        panelsup.add(txid);
        panelsup.add(new JLabel("Nombre:"));
        panelsup.add(txnombre);
        panelsup.add(new JLabel("Cantidad:"));
        panelsup.add(txtcantidad);

        add(panelsup, BorderLayout.NORTH);
        add(new JScrollPane(listaProductos), BorderLayout.CENTER);

        JPanel panelinf = new JPanel(new FlowLayout());
        panelinf.add(btnAdd);
        panelinf.add(btnDel);
        add(panelinf, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
    }
}
