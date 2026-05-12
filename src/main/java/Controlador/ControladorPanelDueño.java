/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vistas.VistaPanelDueño;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author felip
 */
public class ControladorPanelDueño implements ActionListener {

    private VistaPanelDueño vista;
    private modelo.BackendService backend;

    // Constructor principal
    public ControladorPanelDueño(VistaPanelDueño vista) {
        this.vista = vista;
        this.backend = new modelo.BackendService();
        inicializarEventos();
    }

    // Constructor sobrecargado (requisito POO)
    public ControladorPanelDueño(VistaPanelDueño vista, 
                                  modelo.BackendService backend) {
        this.vista = vista;
        this.backend = backend;
        inicializarEventos();
    }

    private void inicializarEventos() {
        vista.getBtnVerReservas().addActionListener(this);
        vista.getBtnCancelarReserva().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnCerrarSesion().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();

        if (fuente == vista.getBtnVerReservas()) {
            accionVerReservas();
        } else if (fuente == vista.getBtnCancelarReserva()) {
            accionCancelarReserva();
        } else if (fuente == vista.getBtnActualizar()) {
            accionActualizar();
        } else if (fuente == vista.getBtnCerrarSesion()) {
            accionCerrarSesion();
        }
    }

    private void accionVerReservas() {
        try {
            vista.getModeloTabla().limpiarTabla();
            vista.setEstado("Cargando reservas...");
            // Jhostyn conectará el backend aquí
            vista.setEstado("Reservas cargadas correctamente.");
        } catch (Exception ex) {
            vista.mostrarMensaje("Error al cargar reservas: " 
                + ex.getMessage());
            vista.setEstado("Error al cargar reservas.");
        }
    }

    private void accionCancelarReserva() {
        try {
            int fila = vista.getFilaSeleccionada();

            // Validacion: verificar que haya una fila seleccionada
            if (fila == -1) {
                vista.mostrarMensaje(
                    "Debe seleccionar una reserva para cancelar.");
                return;
            }

            // Validacion: confirmar antes de cancelar
            int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro que desea cancelar esta reserva?",
                "Confirmar cancelación",
                javax.swing.JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
                vista.getModeloTabla().eliminarFila(fila);
                vista.setEstado("Reserva cancelada correctamente.");
            }

        } catch (Exception ex) {
            vista.mostrarMensaje("Error al cancelar reserva: " 
                + ex.getMessage());
            vista.setEstado("Error al cancelar reserva.");
        }
    }

    private void accionActualizar() {
        try {
            vista.getModeloTabla().limpiarTabla();
            vista.setEstado("Tabla actualizada.");
        } catch (Exception ex) {
            vista.mostrarMensaje("Error al actualizar: " 
                + ex.getMessage());
            vista.setEstado("Error al actualizar.");
        }
    }

    private void accionCerrarSesion() {
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
            null,
            "¿Está seguro que desea cerrar sesión?",
            "Cerrar sesión",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            vista.dispose();
            vista.setEstado("Sesión cerrada.");
        }
    }
}
