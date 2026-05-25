/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author isabe
 */
public class PanelDetallesCancha extends JPanel {

    private JLabel lblNombre;
    private JLabel lblEstado;
    private JTextArea txtInformacion;

    public PanelDetallesCancha() {

        setLayout(new BorderLayout());

        inicializarComponentes();
    }

    private void inicializarComponentes() {

        JPanel panelSuperior = new JPanel(new GridLayout(2, 1));

        lblNombre = new JLabel("Nombre: ");
        lblEstado = new JLabel("Estado: ");

        panelSuperior.add(lblNombre);
        panelSuperior.add(lblEstado);


        txtInformacion = new JTextArea();
        txtInformacion.setEditable(false);
        txtInformacion.setText(
                "SERVICIOS:\n"
                + "- Baños\n"
                + "- Parqueadero\n"
                + "- Iluminación\n\n"
                + "REGLAS:\n"
                + "- Puntualidad\n"
                + "- No fumar\n"
                + "- Uso responsable de la cancha"
        );

        JScrollPane scroll = new JScrollPane(txtInformacion);

        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    public void setDatosCancha(String nombre, boolean disponible) {

        lblNombre.setText("Nombre: " + nombre);

        lblEstado.setText(
                "Estado: "
                + (disponible ? "Disponible" : "Ocupada")
        );
    }
}