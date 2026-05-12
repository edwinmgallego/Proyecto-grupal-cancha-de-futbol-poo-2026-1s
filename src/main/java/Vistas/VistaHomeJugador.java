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
    private JButton btnMiPerfil;
    private JLabel lblTitulo;
    private JButton btnBuscarCanchas;
    private JButton btnReservar;
    private JButton btnMisReservas;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaCanchas;

    public VistaHomeJugador() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        setTitle("Sistema de Reservas - Jugador");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {
        JPanel panelSuperior = new JPanel();
        btnBuscarCanchas = new JButton("Ver Disponibilidad");
        btnReservar = new JButton("Reservar Seleccionada");

        lblTitulo = new JLabel("Bienvenido al sistema de canchas", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));


        btnMiPerfil = new JButton("Mi Perfil");
        panelSuperior.add(btnMiPerfil);

        btnMisReservas = new JButton("Mis Reservas");
        panelSuperior.add(btnMisReservas);

        panelSuperior.add(btnBuscarCanchas);
        panelSuperior.add(btnReservar);

        modeloLista = new DefaultListModel<>();
        listaCanchas = new JList<>(modeloLista);

        JPanel panelNorte = new JPanel(new BorderLayout());
        panelNorte.add(lblTitulo, BorderLayout.NORTH);
        panelNorte.add(panelSuperior, BorderLayout.CENTER);

        add(panelNorte, BorderLayout.NORTH);
        add(new JScrollPane(listaCanchas), BorderLayout.CENTER);
    }

    // --- GETTERS PARA QUE EL CONTROLADOR ACCEDA A LA VISTA ---
    public JButton getBtnBuscarCanchas() {
        return btnBuscarCanchas;
    }

    public JButton getBtnReservar() {
        return btnReservar;
    }

    public DefaultListModel<String> getModeloLista() {
        return modeloLista;
    }

    public JList<String> getListaCanchas() {
        return listaCanchas;
    }

    public JButton getBtnMisReservas() {
        return btnMisReservas;
    }

    public JButton getBtnMiPerfil() {
        return btnMiPerfil;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
