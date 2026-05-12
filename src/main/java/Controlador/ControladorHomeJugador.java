/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author cript
 */

import Vistas.VistaHomeJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import modelo.BackendService;
import modelo.CanchaDTO;

public class ControladorHomeJugador implements ActionListener {
    
    private VistaHomeJugador vista;
    private BackendService backend; // Instancia de tu .jar

    public ControladorHomeJugador(VistaHomeJugador vista, BackendService backend) {
        this.vista = vista;
        this.backend = backend;
        
        // "Suscribimos" el controlador a los botones de la vista
        this.vista.getBtnBuscarCanchas().addActionListener(this);
        this.vista.getBtnReservar().addActionListener(this);
        this.vista.getBtnMiPerfil().addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    // Único lugar donde se gestionan los clics
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBtnBuscarCanchas()) {
            cargarCanchas();
        } 
        
        else if (e.getSource() == vista.getBtnReservar()) {
            realizarReserva();
        }
    }

    private void cargarCanchas() {
        // 1. Llama al backend (.jar)
        List<CanchaDTO> disponibles = backend.obtenerCanchasDisponibles();
        
        // 2. Actualiza la vista
        vista.getModeloLista().clear();
        for (CanchaDTO cancha : disponibles) {
            vista.getModeloLista().addElement(cancha.toString());
        }
    }

    private void realizarReserva() {
        String canchaSeleccionada = vista.getListaCanchas().getSelectedValue();
        
        if (canchaSeleccionada == null) {
            vista.mostrarMensaje("Por favor, seleccione una cancha primero.");
            return;
        }

        // Simula la llamada al método de reserva de tu .jar
        boolean exito = backend.procesarReserva(canchaSeleccionada);
        
        if (exito) {
            vista.mostrarMensaje("¡Reserva confirmada exitosamente!");
        } else {
            vista.mostrarMensaje("Error al procesar la reserva.");
        }
    }
}
