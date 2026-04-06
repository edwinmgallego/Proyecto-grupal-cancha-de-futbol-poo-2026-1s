/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author cript
 */
import javax.swing.*;
import java.awt.*;

public class VistaHomeJugador extends JFrame {
    // Componentes de la interfaz
    private JButton btnBuscarCanchas;
    private JButton btnReservar;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaCanchas;

    public VistaHomeJugador() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        setTitle("Sistema de Reservas - Jugador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {
        JPanel panelSuperior = new JPanel();
        btnBuscarCanchas = new JButton("Ver Disponibilidad");
        btnReservar = new JButton("Reservar Seleccionada");
        
        panelSuperior.add(btnBuscarCanchas);
        panelSuperior.add(btnReservar);
        
        modeloLista = new DefaultListModel<>();
        listaCanchas = new JList<>(modeloLista);
        
        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(listaCanchas), BorderLayout.CENTER);
    }

    // --- GETTERS PARA QUE EL CONTROLADOR ACCEDA A LA VISTA ---
    public JButton getBtnBuscarCanchas() { return btnBuscarCanchas; }
    public JButton getBtnReservar() { return btnReservar; }
    public DefaultListModel<String> getModeloLista() { return modeloLista; }
    public JList<String> getListaCanchas() { return listaCanchas; }
    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
